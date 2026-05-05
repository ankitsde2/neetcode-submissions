class Node {
    private int key, val;
    private Node next, prev;
    public Node() {
        key = val = -1;
        next = prev = null;
    }
    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        next = prev = null;
    }
}
class LRUCache {
    private int capacity;
    private Node head, tail;
    private Map<Integer, Node> hm;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        hm = new HashMap<>();
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    private void deleteNode(Node node) {
        Node nextNode = node.next;
        Node prevNode = node.prev;
        nextNode.prev = prevNode;
        prevNode.next = nextNode;
    }

    private void insertNodeAfterHead(Node node) {
        Node nextNode = head.next;
        nextNode.prev = node;
        node.next = nextNode;
        node.prev = head;
        head.next = node;
    }

    public int get(int key) {
        if (hm.containsKey(key)) {
            Node node = hm.get(key);
            deleteNode(node);
            insertNodeAfterHead(node);
            return node.val;
        } else
            return -1;
    }

    public void put(int key, int value) {
        if (hm.containsKey(key)) {
            Node node = hm.get(key);
            node.val = value;
            deleteNode(node);
            insertNodeAfterHead(node);
        } else {
            if (hm.size() == capacity) {
                Node node = tail.prev;
                deleteNode(node);
                hm.remove(node.key);
            }
            Node newNode = new Node(key, value);
            hm.put(key, newNode);
            insertNodeAfterHead(newNode);
        }
    }
}

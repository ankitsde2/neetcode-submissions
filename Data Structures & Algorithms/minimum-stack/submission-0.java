class MinStack {
    Deque<Integer> st;
    public MinStack() {
        st = new ArrayDeque<>();
    }

    public void push(int val) {
        st.push(val);
    }

    public void pop() {
        if (!st.isEmpty())
            st.pop();
    }

    public int top() {
        if (!st.isEmpty()){
            return st.peek();
        }
        return -1;
    }

    public int getMin() {
        List<Integer> li = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        while (!st.isEmpty()) {
            int ele = st.pop();
            min = Math.min(ele, min);
            li.add(ele);
        }
    
        for (int i=li.size()-1;i>=0;i--) {
            st.push(li.get(i));
        }
        return min;
    }
}

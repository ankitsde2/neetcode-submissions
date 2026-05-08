class MinStack {
    class Pair {
        int value;
        int min;
        Pair(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }
    Stack<Pair> st;
    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.push(new Pair(val, val));
        } else {
            int min = Math.min(st.peek().min, val);
            st.push(new Pair(val, min));
        }
    }

    public void pop() {
        if (!st.isEmpty())
            st.pop();
    }

    public int top() {
        if (!st.isEmpty()) {
            return st.peek().value;
        }
        return -1;
    }

    public int getMin() {
        if (!st.isEmpty()) {
            return st.peek().min;
        }
        return -1;
    }
}

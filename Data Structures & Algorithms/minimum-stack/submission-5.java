class MinStack {
    long min;
    Stack<Long> st;
    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            min = (long) val;
            st.push((long) val);
        } else if (val < min) {
            st.push((2 * (long) val - min));
            min = val;
        } else {
            st.push((long) val);
        }
    }

    public void pop() {
        if (st.peek() < min) {
            min = 2 * min - st.peek();
            st.pop();
        } else
            st.pop();
    }

    public int top() {
        if (st.peek() < min)
            return (int) min;
        else
            return st.peek().intValue();
    }

    public int getMin() {
        return (int) min;
    }
}

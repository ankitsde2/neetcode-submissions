class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();
        for (String str : tokens) {
            if (str.equals("+")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            } else if (str.equals("-")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            } else if (str.equals("*")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            } else if (str.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            } else {
                st.push(Integer.parseInt(str));
            }
        }
        return st.pop();
    }
}

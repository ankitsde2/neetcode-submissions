class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        char[] ca = s.toCharArray();
        for (Character ch : ca) {
            if (!st.isEmpty() && ch == ')') {
                if (st.peek() == '(') st.pop();
                else return false;
            }
            else if (!st.isEmpty() && ch == '}') {
                if (st.peek() == '{') st.pop();
                else return false;
            }
            else if (!st.isEmpty() && ch == ']') {
                if (st.peek() == '[') st.pop();
                else return false;
            }
            else
                st.push(ch);
        }
        return st.isEmpty();
    }
}

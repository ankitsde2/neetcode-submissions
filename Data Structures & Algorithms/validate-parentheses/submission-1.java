class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        char[] ca = s.toCharArray();
        for (Character ch : ca) {
            if (!st.isEmpty() && ch == ')' && st.peek() == '(')
                st.pop();
            else if (!st.isEmpty() && ch == '}' && st.peek() == '{')
                st.pop();
            else if (!st.isEmpty() && ch == ']' && st.peek() == '[')
                st.pop();
            else
                st.push(ch);
        }
        return st.isEmpty();
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)) sb.append(Character.toLowerCase(c));
        }
        String str=sb.toString();
        String rev=new StringBuilder(str).reverse().toString();

        return str.equals(rev);
    }
}

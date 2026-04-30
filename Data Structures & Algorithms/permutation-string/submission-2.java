class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        char[] str1=s1.toCharArray();
        Arrays.sort(str1);
        String sortedS1= new String(str1);
        for(int i=0;i+n1<=n2;i++){
            char[] subS2= s2.substring(i,i+n1).toCharArray();
            Arrays.sort(subS2);
            String sortedSubS2=new String(subS2);
            if(sortedS1.equals(sortedSubS2)) return true;
        }
        return false;
    }
}

class Solution {
    
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length());
            sb.append('/');
            sb.append(str.toCharArray());
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int n=str.length();
        List<String> result=new ArrayList<>();
        if(n==0) return result;
        int i=0;
        while(i<n){
            int j=i;
            while(str.charAt(j)!='/') j++;
            int len=Integer.parseInt(str.substring(i,j));
            result.add(str.substring(j+1,j+len+1));
            i=j+len+1;
        }
        return result;
    }
}

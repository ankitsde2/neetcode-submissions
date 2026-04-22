class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for(String str:strs){
            sb.append(str.length());
            sb.append(',');
        }
        sb.append('#');
        for(String str:strs){
            sb.append(str);
        }
        return sb.toString();
    }
    public List<String> decode(String str) {
        int n=str.length();
        List<String> result= new ArrayList<>();
        if(n==0) return result;
        List<Integer> sizes= new ArrayList<>();
        int i=0;
        while(str.charAt(i)!='#'){
            int j=i;
            while(str.charAt(j)!=',') j++;
            sizes.add(Integer.parseInt(str.substring(i,j)));
            i=j+1;
        }
        i++;
        for(int size: sizes){
            result.add(str.substring(i,i+size));
            i=i+size;
        }
        return result;
    }
}

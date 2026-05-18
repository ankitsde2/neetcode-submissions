class Solution {
    class Pair{
        int key;
        int val;
        Pair(int key, int val){
            this.key=key;
            this.val=val;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        // Revision 1
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        List<Pair> li= new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            li.add(new Pair(entry.getKey(),entry.getValue()));
        }
        Collections.sort(li,(a,b)->b.val-a.val);
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=li.get(i).key;
        }
        return result;
    }
}

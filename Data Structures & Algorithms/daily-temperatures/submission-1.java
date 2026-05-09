class Solution {
    class Pair{
        int val;
        int ind;
        Pair(int val, int ind){
            this.val=val;
            this.ind=ind;
        }
    }
    public int[] dailyTemperatures(int[] nums) {
        int n=nums.length;
        int[] result= new int[n];
        Deque<Pair> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek().val<nums[i]){
                result[st.peek().ind]=i-st.peek().ind;
                st.pop();
            }
            st.push(new Pair(nums[i],i));
        }
        return result;
    }
}

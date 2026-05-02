class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int ans = 0;
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, piles[i]);
        }
        int low = 1;
        int high = maxi;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.ceil((double)piles[i] / mid);
            }
            if ((int)sum <= h) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }
}

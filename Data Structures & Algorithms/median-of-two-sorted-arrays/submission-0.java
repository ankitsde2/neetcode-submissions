class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int left = 0;
        int right = 0;
        List<Integer> list = new ArrayList<>();
        while (left < n1 && right < n2) {
            if (nums1[left] <= nums2[right]) {
                list.add(nums1[left]);
                left++;
            } else {
                list.add(nums2[right]);
                right++;
            }
        }
        while (left < n1) {
            list.add(nums1[left]);
            left++;
        }
        while (right < n2) {
            list.add(nums2[right]);
            right++;
        }
        if ((n1 + n2) % 2 == 0)
            return ((double) list.get((n1 + n2) / 2) + list.get((n1 + n2) / 2 - 1)) / 2;
        return (double) list.get((n1 + n2) / 2);
    }
}

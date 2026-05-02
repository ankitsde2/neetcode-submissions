class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int left = 0;
        int right = 0;
        int ind1 = (n1 + n2) / 2;
        int ind2 = ind1 - 1;
        int ind1Ele = -1;
        int ind2Ele = -1;
        int count = 0;
        while (left < n1 && right < n2) {
            if (nums1[left] <= nums2[right]) {
                if (count == ind1)
                    ind1Ele = nums1[left];
                if (count == ind2)
                    ind2Ele = nums1[left];
                count++;
                left++;
            } else {
                if (count == ind1)
                    ind1Ele = nums2[right];
                if (count == ind2)
                    ind2Ele = nums2[right];
                count++;
                right++;
            }
        }
        while (left < n1) {
            if (count == ind1)
                ind1Ele = nums1[left];
            if (count == ind2)
                ind2Ele = nums1[left];
            count++;
            left++;
        }
        while (right < n2) {
            if (count == ind1)
                ind1Ele = nums2[right];
            if (count == ind2)
                ind2Ele = nums2[right];
            count++;
            right++;
        }
        if ((n1 + n2) % 2 == 0)
            return (((double) ind1Ele + ind2Ele) / 2);
        return (double) ind1Ele;
    }
}

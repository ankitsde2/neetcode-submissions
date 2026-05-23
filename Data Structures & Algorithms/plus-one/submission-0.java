class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        List<Integer> li = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] + carry > 9) {
                li.add(0);
                carry = 1;
            } else {
                li.add(digits[i]+carry);
                carry = 0;
            }
        }
        if (carry > 0)
            li.add(carry);
        int m = li.size();
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            result[m - 1 - i] = li.get(i);
        }
        return result;
    }
}

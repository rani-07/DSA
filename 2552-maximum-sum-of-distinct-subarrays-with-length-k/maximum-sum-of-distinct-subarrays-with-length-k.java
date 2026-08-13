class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        long sum = 0;
        long maxsum = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int r = 0; r < n; r++) {

            // If duplicate exists, remove elements from left
            while (set.contains(nums[r])) {
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }

            set.add(nums[r]);
            sum += nums[r];

            // Window size should be k
            if (r - l + 1 == k) {
                maxsum = Math.max(maxsum, sum);

                // Remove left element before moving forward
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
        }

        return maxsum;
    }
}
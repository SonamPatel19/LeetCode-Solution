class Solution {
    public int splitArray(int[] nums, int k) {
        long low = 0;
        long high = 0;

        // low = maximum element
        // high = total sum
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                // mid is possible, try smaller
                high = mid - 1;
            } else {
                // mid is not possible, need larger
                low = mid + 1;
            }
        }

        return (int) low;
    }

    public boolean canSplit(int[] nums, int k, long maxSum) {
        long sum = 0;
        int parts = 1;

        for (int num : nums) {

            if (sum + num > maxSum) {
                parts++;
                sum = num;
            } else {
                sum += num;
            }
        }

        return parts <= k;
    }
}
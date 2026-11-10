public class Solution {
    public int[] searchRange(int[] A, int target) {

        int low = 0, high = A.length - 1;
        int first = -1, last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (A[mid] >= target) {
                if (A[mid] == target)
                    first = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = A.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (A[mid] <= target) {
                if (A[mid] == target)
                    last = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}
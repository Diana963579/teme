public class MonotonicArray {
        public static boolean isMonotonic(int[] arr) {
            boolean isIncreasing = true;
            boolean isDecreasing = true;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    isDecreasing = false;
                }
                if (arr[i] < arr[i - 1]) {
                    isIncreasing = false;
                }
            }

            return isIncreasing || isDecreasing;
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 2, 3};
            System.out.println("Este monotonic? " + isMonotonic(array)); // Output: true
        }
    }
public class GenericMax {
        public static <T extends Number & Comparable<T>> T getMax(T[] numbers) {
            if (numbers == null || numbers.length == 0) {
                return null;
            }
            T max = numbers[0];
            for (T number : numbers) {
                if (number.compareTo(max) > 0) {
                    max = number;
                }
            }
            return max;
        }

        public static void main(String[] args) {
            Integer[] integers = {3, 5, 1, 9, 7};
            System.out.println("Max: " + getMax(integers));
        }
    }
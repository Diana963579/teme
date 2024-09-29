public class LongestWord {
        public static String findLongestWord(String sentence) {
            String[] words = sentence.split(" ");
            String longestWord = "";

            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            return longestWord;
        }

        public static void main(String[] args) {
            String sentence = "Exemplul de mai sus este un test simplu";
            System.out.println("Cel mai lung cuvânt: " + findLongestWord(sentence)); // Output: "Exemplul"
        }
    }
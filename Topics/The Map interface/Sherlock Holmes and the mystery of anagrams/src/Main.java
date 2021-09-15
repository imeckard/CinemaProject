
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] firstWord = scan.nextLine().toLowerCase().split("(?!^)");
        String[] secondWord = scan.nextLine().toLowerCase().split("(?!^)");
        System.out.println(anagramMap(firstWord).equals(anagramMap(secondWord)) ? "yes" : "no");

    }


    public static Map<String, Integer> anagramMap(String[] array) {
        Map<String, Integer> wordMap = new TreeMap<>();
        for (String s : array) {
            if (wordMap.containsKey(s)) {
                wordMap.put(s, wordMap.get(s) + 1);
            } else {
                wordMap.put(s, 1);
            }
        }
        return wordMap;
    }
}
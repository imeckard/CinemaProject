import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> dictionary = new HashSet<>();
        Set<String> uniqueWords = new HashSet<>();

        int dicLength = Integer.parseInt(scan.nextLine()) ;
        for (int i = 0; i < dicLength; i++) {
            dictionary.add(scan.nextLine().toLowerCase());
        }

        int lines = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < lines; i++) {
            Set<String> tempSet = Arrays.stream(scan.nextLine().toLowerCase().split("\\s+")).collect(Collectors.toSet());
            uniqueWords.addAll(tempSet);
        }

        uniqueWords.removeAll(dictionary);
        printSet(uniqueWords);
    }

    public static void printSet(Set<String> set) {
        for(String word : set) {
            System.out.println(word);
        }
    }

}

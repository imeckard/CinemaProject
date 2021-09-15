import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> stringList = Arrays
                .stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i < stringList.size(); i += 2) {
            intList.add(Integer.parseInt(stringList.get(i)));
        }
        for (int i = intList.size() - 1; i >= 0; i--) {
            System.out.print(intList.get(i) + " ");
        }
    }
}
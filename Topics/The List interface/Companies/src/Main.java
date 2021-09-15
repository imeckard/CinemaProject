import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> yourList = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        System.out.println(yourList);
    }
}
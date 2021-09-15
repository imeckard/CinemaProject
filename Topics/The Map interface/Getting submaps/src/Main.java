
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SortedMap<Integer, String> bigMap = new TreeMap<>();
        int min = scan.nextInt();
        int max = scan.nextInt() + 1;
        int total = scan.nextInt();
        for (int i = 0; i < total; i++) {
            int key = scan.nextInt();
            String str = scan.next();
            bigMap.put(key, str);
        }
        SortedMap<Integer, String> smolMap = bigMap.subMap(min, max);
        smolMap.forEach((key, str) -> System.out.println(key + " " + str));
    }
}


public class Item {
    public String id;
    public String name;
    public String price;

    Item() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int n = scan.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (String s : input) {
            nums.add(Integer.parseInt(s));
        }
        int inc = 0;
        ArrayList<Integer> closeNums = new ArrayList<>();
        while (true) {
            for (Integer x : nums) {
                if (x == n + inc || x == n - inc) {
                    closeNums.add(x);
                }
            }
            if (!closeNums.isEmpty()) {
                Collections.sort(closeNums);
                for (Integer y : closeNums) {
                    System.out.print(y + " ");
                }
                break;
            } else {
                inc++;
            }

        }
    }
}
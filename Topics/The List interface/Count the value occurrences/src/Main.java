class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        return checkNumberOfTimes(elem, list1) == checkNumberOfTimes(elem, list2);
    }

    public static int checkNumberOfTimes(int elem, List<Integer> list) {
        int total = 0;
        for (Integer num : list) {
            if (num == elem) {
                total++;
            }
        }
        return total;
    }
}
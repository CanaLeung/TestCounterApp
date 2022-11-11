package Entities;

public class counter {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public static void addCount(int add){
        count = count + add;
    }

    public static void setCount(int set) {
        count = set;
    }
}

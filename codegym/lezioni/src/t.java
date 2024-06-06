public class t {
    private static int catCount = 0;

    public static void setCatCount(int catCount) {
        t.catCount = t.catCount + catCount;

    }

    public static void main(String[] args) {
        setCatCount(5);
        setCatCount(10);
        System.out.println(catCount);
    }
}

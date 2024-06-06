package MyLessons.Object.StaticClassEx;

public class CatCount {
    private static int catCount = 0;

    public CatCount() {
        catCount++;
    }

    public static int getCatCount() {
        return CatCount.catCount;

    }

    public static void setCatCount(int catCount) {
        CatCount.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}

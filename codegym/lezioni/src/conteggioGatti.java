public class conteggioGatti {
    private static int catCount = 0;

    public static void addNewCat() {
        conteggioGatti.catCount++;
    }

    public static void main(String[] args) {
        addNewCat();
        System.out.println(catCount);
        addNewCat();
        System.out.println(catCount);

    }
}

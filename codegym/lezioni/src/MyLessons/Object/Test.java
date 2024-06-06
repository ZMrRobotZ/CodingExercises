package MyLessons.Object;
import MyLessons.Object.Fight;

public class Test {
    public static void main(String[] args) {
        Fight kaj = new Fight();
        Fight red = new Fight();

        kaj.age = 7;
        red.age = 9;

        System.out.println(kaj.fight(red));
    }
}

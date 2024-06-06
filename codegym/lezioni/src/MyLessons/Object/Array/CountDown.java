package MyLessons.Object.Array;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Boom!");
    }
}

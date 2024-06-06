package MyLessons;

public class absolute {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

        public static void checkInterval(int a) {
            String check;
            check = a > 50 ? a < 100 ? "The number " + 60 + " is in the interval" : "The number " + a + " is not in the interval." : "The number " + a + " is not in the interval.";
            System.out.println(check);


        }

}

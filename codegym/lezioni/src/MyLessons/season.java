package MyLessons;

public class season {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if(month > 2 && month <= 5){
            System.out.println("spring");
        }
        else if(month > 5 && month <= 8){
            System.out.println("summer");
        }
        else if(month > 8 && month <= 11){
            System.out.println("autumn");
        }
        else{
            System.out.println("winter");
        }
    }
}

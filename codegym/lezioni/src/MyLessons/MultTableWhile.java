package MyLessons;

public class MultTableWhile {
    public static void main(String[] args) throws Exception {
        int i = 1;
        while(i <= 10){
            int j = 1;
            while(j <= 10){
                System.out.print(i * j + " ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DescribingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if(number < 10){
            if(number % 2 == 0) {
                System.out.println("even single-digit number");
            } else {
                System.out.println("odd single-digit number");
            }
        } else if (number <= 99 ) {
            if(number % 2 == 0) {
                System.out.println("even two-digit number");
            } else {
                System.out.println("odd two-digit number");
            }
        } else if (number < 999) {
            if(number % 2 == 0) {
                System.out.println("even three-digit number");
            } else {
                System.out.println("odd three-digit number");
            }
        }
    }
}

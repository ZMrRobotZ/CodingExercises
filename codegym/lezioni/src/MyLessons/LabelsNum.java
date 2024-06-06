package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabelsNum {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if(number % 2 == 0 && number > 0){
            // Pari e positivo
            System.out.println("Positive even number");
        } else if (number % 2 == 0 && number < 0) {
            // Pari e negativo
            System.out.println("Negative even number" );
        } else if (number > 0) {
            // Dispari e positivo
            System.out.println("Positive odd number");
        } else if (number == 0){
            // è zero
            System.out.println("Zero");
        } else {
            //Dispari e negativo
            System.out.println("Negative odd number");
        }
    }
}

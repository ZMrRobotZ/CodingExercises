package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreetHouse {
    public static void main(String[] args) throws IOException {
        //int[] numbers = new int[15];
        int[] numbers = {1,2,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int oddSide = 0;
        int evenSide = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numbers.length; i++) {
            //numbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < numbers.length; i++) {
            if(i%2 == 0){
                evenSide = evenSide + numbers[i];
            }else {
                oddSide = oddSide + numbers[i];
            }
        }

        if(evenSide == oddSide){
        }
        else if(evenSide > oddSide){
            System.out.println("Even-numbered houses have more residents.");
        }else {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}

package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Negative {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nCount = 0;
        int pCount = 0;
        for(int i = 0; i < 3; i++){
            int number = Integer.parseInt(reader.readLine());
            if(number > 0){
                pCount++;
            } else if (number < 0) {
                nCount++;
            }
        }
        System.out.println("Number of negative numbers: " + nCount);
        System.out.println("Number of positive numbers: " + pCount);
    }
}

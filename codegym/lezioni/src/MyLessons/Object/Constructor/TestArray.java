package MyLessons.Object.Constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nNumber = Integer.parseInt(reader.readLine());

        if(nNumber <= 0){
            return;
        }

        int[] numbers = new int[nNumber];
        for(int i = 0; i<nNumber; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int max = numbers[0];
        for(int i = 1; i<nNumber;i++){
            max = max > numbers[i] ? max : numbers[i];
        }
        System.out.println(max);
    }
}

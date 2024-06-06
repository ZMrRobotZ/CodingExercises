package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Positive {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for(int i = 0; i < 3; i++){
            int number = Integer.parseInt(reader.readLine());
            if(number > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

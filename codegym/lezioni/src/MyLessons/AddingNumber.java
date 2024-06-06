package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            int number = Integer.parseInt(reader.readLine());
            sum += number;
            if(number == -1){
                System.out.println(sum);
                break;
            }
        }
    }
}

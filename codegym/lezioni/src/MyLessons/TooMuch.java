package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TooMuch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        int number = Integer.parseInt(reader.readLine());

        while(number > 0){
            System.out.println(word);
            number--;
        }
    }
}

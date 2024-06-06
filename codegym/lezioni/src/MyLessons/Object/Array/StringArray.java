package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringArray {
    public static void main(String[] args) throws IOException {
        String[] words = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            String element = reader.readLine();
            words[i] = element;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}

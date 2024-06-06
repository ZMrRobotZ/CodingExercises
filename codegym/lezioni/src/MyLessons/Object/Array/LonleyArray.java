package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LonleyArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];
        int[] number = new int[10];
        String[] test = {"ciao","come","ssssssss"};

        for (int i = 0; i < 10; i++) {
            strings[i] = reader.readLine();
            number[i] = strings[i].length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(number[i]);
        }
    }
}

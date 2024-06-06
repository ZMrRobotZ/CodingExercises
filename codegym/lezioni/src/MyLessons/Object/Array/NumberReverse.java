package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NumberReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = (numbers.size() - 1); i >= 0; i--) {
            System.out.println(numbers.get(i));
        }

    }
}

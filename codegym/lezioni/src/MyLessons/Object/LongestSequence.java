package MyLessons.Object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class LongestSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }

        int buffer = numbers.get(0);
        int count = 0;
        int longestSequence = 0;

        for(int element : numbers){
            if(element == buffer){
                count++;
            }else {
                buffer = element;
                count = 0;
                count++;
            }
            if(count > longestSequence) {
                longestSequence = count;
            }
        }
        System.out.println(longestSequence);
    }
}

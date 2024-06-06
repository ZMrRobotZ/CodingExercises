package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CheckOrder {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            words.add(reader.readLine());
        }

        String maxLstring = words.get(0);

        for (String element : words){
            if (maxLstring.length() > element.length()){
                System.out.println(words.indexOf(element));
                break;
            }
            maxLstring = words.get(words.indexOf(element));
        }
    }
}

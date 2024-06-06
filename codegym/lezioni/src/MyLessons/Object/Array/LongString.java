package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LongString {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();

        for(int i = 0;i<5;i++) {
            strings.add(reader.readLine());
        }

        String longWord = strings.get(0);

        for(int i = 1;i<5;i++){
            if(strings.get(i).length()>longWord.length()){
                longWord = strings.get(i);
            }
        }

        System.out.println(longWord);

        for(int i = 0;i<5;i++){
            if(longWord.length() == strings.get(i).length()
                    && !longWord.equals(strings.get(i))){
                System.out.println(strings.get(i));
            }
        }
    }
}

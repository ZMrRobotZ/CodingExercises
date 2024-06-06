package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheEnd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        while (true){
            String word = reader.readLine();
            if(word.equals("end")){
                break;
            }
            strings.add(word);
        }

        for (String element : strings){
            System.out.println(element);
        }

    }
}

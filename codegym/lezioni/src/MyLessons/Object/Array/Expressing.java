package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Expressing {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        String shortestString = strings.get(0);

        for(String element : strings){
            if(element.length() < shortestString.length()){
                shortestString = element;
            }
        }

        for(String element : strings){
            if(element.length() == shortestString.length()){
                System.out.println(element);
            }
        }
    }
}

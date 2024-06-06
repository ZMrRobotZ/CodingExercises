package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RemoveInsert {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5 ; i++) {
            strings.add(reader.readLine());
        }

        int stringsLenght = strings.size();

        for(int i = 0; i < 13; i++){
            strings.add(0, strings.get(stringsLenght - 1));
            strings.remove(stringsLenght);
        }

        for(String element : strings){
            System.out.println(strings);
        }
    }
}

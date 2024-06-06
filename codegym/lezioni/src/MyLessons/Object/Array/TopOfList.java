package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class TopOfList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strings = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(0, string);
        }

        for(String element : strings){
            System.out.println(element);
        }
    }
}


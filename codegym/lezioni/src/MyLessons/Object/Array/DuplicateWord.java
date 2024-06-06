package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DuplicateWord {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        System.out.println(result);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> doubleWordList = new ArrayList<>();
        for(String element : list){
            for (int i = 0; i < 2; i++) {
                doubleWordList.add(element);
            }
        }
        return doubleWordList;
    }
}

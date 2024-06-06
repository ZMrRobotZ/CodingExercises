package MyLessons.Object.StaticClassEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AscendinNumber {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numerList = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(reader.readLine());
            numerList.add(num);
        }
        Collections.sort(numerList);
        for (int element : numerList){
            System.out.println(element);
        }
    }
}

package MyLessons;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheUnique {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if(a == b){
            System.out.println("3");
        } else if (b == c) {
            System.out.println("1");
        }else if (a == c) {
            System.out.println("2");
        }


    }
}

package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pair {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if(a == b && a == c){
            System.out.println(a + " " + b + " " + c);
        } else if (a == c){
            System.out.println(a + " " + c);
        } else if (b == c){
            System.out.println(b + " " + c);
        } else if (a == b){
            System.out.println(a + " " + b);
        }
    }
}

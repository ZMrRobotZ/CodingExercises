package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if(((a+b) < c)||((b+c) < a)||((a+c) < b)) {
            System.out.println("The triangle is not possible.");
        }
        else {
            System.out.println("The triangle is possible.");
        }
}
}

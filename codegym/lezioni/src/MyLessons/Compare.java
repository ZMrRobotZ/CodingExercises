package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Compare {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int year = Integer.parseInt(reader.readLine());
        int month = Integer.parseInt(reader.readLine());
        int day= Integer.parseInt(reader.readLine());

        System.out.println("My name is " + name + ".\n" +
                            "I was born on " + month + "/" + day + "/" + year);
    }
}

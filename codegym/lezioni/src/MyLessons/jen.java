package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class jen {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        if (name1.equalsIgnoreCase(name2)){
            System.out.println("The names are identical");
        } else if (name1.equalsIgnoreCase(name2) == false && name1.length() == name2.length()) {
            System.out.println("The names are the same length");
        }else {
        }

    }
}

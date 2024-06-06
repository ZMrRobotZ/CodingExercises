package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class road_test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float timeElapsed = Float.parseFloat(reader.readLine());

        if((timeElapsed%5 >= 0) && (timeElapsed%5 < 3)){
            System.out.println("green");
        } else if ((timeElapsed%5) >= 3 && (timeElapsed%5) < 4) {
            System.out.println("yellow");
        } else if ((timeElapsed%5) >= 4) {
            System.out.println("red");
        }

    }
}


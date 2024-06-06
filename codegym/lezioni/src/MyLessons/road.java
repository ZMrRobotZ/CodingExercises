package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class road {
    public static void main(String[] args) throws IOException {
        float ceck = 0.2f;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float timeElapsed = Float.parseFloat(reader.readLine());
        for(int i = 0; i <= 12; i++){
            if(timeElapsed % 5 == 0 ){
                System.out.println("red");
            } else if ((timeElapsed / 5) - i == ceck || (timeElapsed / 5) - i == ceck*2 || (timeElapsed / 5) - i == ceck*3) {
                System.out.println("green");
            } else if ((timeElapsed / 5) - i == ceck*4) {
                System.out.println("yellow");
            }
            else {
                System.out.println((timeElapsed/5)-(i-1));
            }
        }
    }
}

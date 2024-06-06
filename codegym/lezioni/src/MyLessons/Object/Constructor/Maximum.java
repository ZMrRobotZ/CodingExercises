package MyLessons.Object.Constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maximum {
    public static void main(String[] args) throws IOException {
        int nNumber = 0;
        int max = 0;
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(reader.readLine());

        if(n <= 0){
            return;
        }

        while (nNumber < n) {
            System.out.println("dentro");
            int inputN = Integer.parseInt(reader.readLine());
            max = max > inputN ? max : inputN;
            nNumber++;
        }
        System.out.println(max);
    }
}

package MyLessons.Object.Constructor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ImproveV2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());


        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        return min(min(a,b), min(min(c,d),e));
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

}

package MyLessons.Object.Constructor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Improve {
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
        int min1;
        int min2;
        int min;
        min1 = a < b ? a : b;
        min2 = c < d ? c : d;
        min = min1 < min2 ? min1 : min2;
        return min < e ? min : e;
    }
}

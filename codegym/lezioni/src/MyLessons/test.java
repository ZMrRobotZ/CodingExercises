package MyLessons;

import javax.management.StringValueExp;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

    public static int sumDigitsIntNumber(int number) {
        double x = number * 0.01;
        double y = number * 0.1;
        int result = -9*((int)x+(int)y)+number;
    return result;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(sumDigitsIntNumber(546));
    }
}











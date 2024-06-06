package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int num = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.print(num + " ");
        if(num == a){
            int num2 = b > c ? b : c;
            int min = num2 == b ? c : b;
            System.out.println(num2 + " " + min);
        } else if (num == b) {
            int num2 = a > c ? a : c;
            int min = num2 == a ? c : a;
            System.out.println(num2 + " " + min);
        } else {
            int num2 = b > a ? b : a;
            int min = num2 == a ? b : a;
            System.out.println(num2 + " " + min);
        }
    }
}

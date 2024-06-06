package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomehowAverage {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = a > b ? a > c ? a : c : b > c ? b : c;
        int min = max == a ? b < c ? b : c : max == b ? a < c ? a : c : a < b ? a : b;

        if(max == a && min == b || min == a && max == b){
            //c
            System.out.println(c);
        } else if (max == a || min == a) {
            //b
            System.out.println(b);
        } else{
            //a
            System.out.println(a);
        }

        }
    }

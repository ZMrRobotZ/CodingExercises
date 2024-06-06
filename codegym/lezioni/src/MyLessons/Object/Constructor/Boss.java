package MyLessons.Object.Constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boss {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = reader.readLine();
            if(s.equals("sum")){
                break;
            }
            int number = Integer.parseInt(s);
            sum += number;
        }
        System.out.println(sum);
    }
}

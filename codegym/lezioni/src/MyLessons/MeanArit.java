package MyLessons;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class MeanArit {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float nNum = 0;
        float number = 0;
        float sum = 0;

        while(true){
            number = Integer.parseInt(reader.readLine());
            if(number == -1){
                float mean = sum/nNum;
                System.out.println(mean);
                break;
            }
            sum += number;
            nNum++;
        }
    }
}

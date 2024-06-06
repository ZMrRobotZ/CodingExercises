package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneLTwoS {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        //int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < numbers.length; i++) {
            if(i <= 9){
                array1[i] = numbers[i];
            }else {
                array2[i-10] = numbers[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }
    }
}

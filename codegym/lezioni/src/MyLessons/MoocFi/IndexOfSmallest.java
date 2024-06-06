package MyLessons.MoocFi;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        while (true){
            int number = Integer.parseInt(scanner.nextLine());
            if(number == 9999){
                break;
            }
            numbers.add(number);
        }

        int index = 0;
        int min = numbers.get(0);

        while (index < numbers.size()){
            if(numbers.get(index) < min){
                min = numbers.get(index);
            }
            index++;
        }

        System.out.println("Smallest number: " + min);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == min){
                System.out.println("Found at index: " + i);
            }
        }
    }
}

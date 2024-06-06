package MyLessons.MoocFi;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.print("Search for? ");
        int search = Integer.parseInt(scanner.nextLine());
        int index = 0;

        while(index < list.size()){
            if(list.get(index) == search){
                System.out.println(search + " is at index " + index);
            }
            index++;
        }
    }
}

package MyLessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class number_of_day {
    public static void main(String[] args) throws IOException{
        int x;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double yearNumber = Double.parseDouble(reader.readLine());
        if(yearNumber % 100 == 0){
            if(yearNumber % 400 == 0){
                // Anno secolare e bisestile
                x = 366;
            }
            else{
                // Anno secolare normale
                x = 365;
            }
        }
        else {
            if (yearNumber % 4 == 0) {
                // Anno non secolare e bisestile
                x = 366;
            } else {
                // Anno non secolare e normale
                x = 365;
            }
        }
        System.out.println("Number of days in the year: " + x);
    }
}

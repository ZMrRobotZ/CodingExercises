package MyLessons.Object.StaticClassEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        return word;
    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        return number;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double fractional = Double.parseDouble(reader.readLine());
        return fractional;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String trueOrFalse = reader.readLine();
        boolean val = false;
        if(trueOrFalse.equals("true")){
            val = true;
        }else if(trueOrFalse.equals("false")){
            val = false;
        }
        return val;
    }

    public static void main(String[] args) throws Exception{
        boolean test = ConsoleReader.readBoolean();
        System.out.println(test);
    }
}

package MyLessons.Object.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortLong {
        public static void main(String[] args) throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> strings = new ArrayList<String>();
            for (int i = 0; i < 10; i++) {
                strings.add(reader.readLine());
            }

            String stringMax = strings.get(0);
            String stringMin = strings.get(0);

            for(String element : strings){
                if(element.length() > stringMax.length()){
                    stringMax = element;
                }
                if(element.length() < stringMin.length()){
                    stringMin = element;
                }
            }

            for(String element : strings){
                if(element.length() == stringMax.length()){
                    System.out.println("La stringa Lunga: " + stringMax + " è la prima");
                    break;
                }else if (element.length() == stringMin.length()){
                    System.out.println("La stringa Corta: " + stringMin + " è la prima");
                    break;
                }

            }
        }
}

package MyLessons.Object.Array;

import java.io.IOException;
import java.util.ArrayList;

public class RorLv2 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> resultList = new ArrayList<String>();

        for(String element : list){

            if(element.contains("r") && !element.contains("l")){
                continue;
            }

            if(element.contains("l") && !element.contains("r")){
                resultList.add(element);
            }
            resultList.add(element);
        }
        return resultList;
    }
}

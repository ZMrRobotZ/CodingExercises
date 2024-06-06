package MyLessons.Object.Array;

import java.io.IOException;
import java.util.ArrayList;

public class RorL {
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

        ArrayList<String> remove = new ArrayList<String>();
        ArrayList<String> duplicate = new ArrayList<String>();

        for (String element : list){
            if (element.contains("r") && !element.contains("l")){
                remove.add(element);
            }
            else if (element.contains("l") && !element.contains("r")) {
                duplicate.add(element);
            }
        }

        list.addAll(duplicate);

        for(int i = 0; i < list.size(); i++){
            for (int j = 0; j < remove.size(); j++) {
                if(list.get(i).equals(remove.get(j))){
                    list.remove(remove.get(j));
                }
            }
        }

        return list;
    }
}

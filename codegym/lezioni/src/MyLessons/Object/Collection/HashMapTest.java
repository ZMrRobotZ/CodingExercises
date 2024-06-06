package MyLessons.Object.Collection;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) throws Exception {
        //write your code here
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("watermelon","melon");
        map.put("banana","fruit");
        map.put("cherry","fruit");
        map.put("pear","fruit");
        map.put("cantaloupe","melon");
        map.put("blackberry","fruit");
        map.put("ginseng","foot");
        map.put("strawberry","fruit");
        map.put("iris","flower");
        map.put("potato","tuber");

        System.out.println(map.entrySet());
        System.out.println(map.keySet());

        for(String element : map.keySet()){
            System.out.println(element + " - " + map.get(element));
        }


    }
}


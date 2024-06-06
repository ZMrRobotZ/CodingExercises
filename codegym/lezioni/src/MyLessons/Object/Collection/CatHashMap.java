package MyLessons.Object.Collection;

import java.util.Map;
import java.util.HashMap;

public class CatHashMap {
    public static void main(String[] args) throws Exception {
    String[] cats = new String[]{"Tiger", "Missy", "Smokey", "Marmalade", "Oscar", "Snowball", "Boss", "Smudge", "Max", "Simba"};

    HashMap<String, Cat> map = addCatsToMap(cats);

    for (Map.Entry<String, Cat> pair : map.entrySet()) {
        System.out.println(pair.getKey() + " - " + pair.getValue());
    }
}


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        //write your code here
        HashMap<String, Cat> addMap = new HashMap<String, Cat>();
        for(String cat : cats){
            addMap.put(cat, new Cat(cat));
        }
        return addMap;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}

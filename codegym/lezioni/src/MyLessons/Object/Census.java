package MyLessons.Object;

import java.util.*;

public class Census {

    public static HashMap<String, String> createMap() {
        HashMap<String, String> censusMap = new HashMap<>();
        censusMap.put("Zanasi", "Marco");
        censusMap.put("Rossi", "Carlo");
        censusMap.put("Neri", "Antonio");
        censusMap.put("Mingardi", "Alice");
        censusMap.put("Peri", "Adda");
        censusMap.put("Gerinio", "Carlo");
        censusMap.put("Settimo", "Marcello");
        censusMap.put("Genino", "Paolo");
        censusMap.put("Paoletti", "Andrea");
        censusMap.put("Mignardi", "Giorgio");

        return censusMap;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int countName = 0;
        for (String element : map.values()){
            if(element.equals(name)){
                countName++;
            }
        }
        return countName;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int countName = 0;
        for (String element : map.keySet()){
            if(element.equals(lastName)){
                countName++;
            }
        }
        return countName;
    }



    public static void main(String[] args) {
        HashMap<String, String> censusMap = createMap();
        System.out.println(getSameFirstNameCount(censusMap, "Carlo"));
        System.out.println(getSameLastNameCount(censusMap, "Paoletti"));
    }

}

package MyLessons.Object;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class KindEmmaSummerHoliday {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 3 1988"));
        map.put("Rossi", df.parse("JUNE 1 1980"));
        map.put("Bianchi", df.parse("JULY 4 1999"));
        map.put("Peri", df.parse("AUGUST 17 1976"));
        map.put("Serli", df.parse("OCTOBER 13 1990"));
        map.put("Bini", df.parse("DECEMBER 2 1988"));
        map.put("Giostri", df.parse("APRIL 8 1985"));
        map.put("Serdoni", df.parse("JANUARY 20 1999"));
        map.put("Casablanca", df.parse("DECEMBER 15 1999"));
        map.put("Spezzi", df.parse("JUNE 1 1988"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //summer from June 1 to August 31 - 5/1 to 7/31
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            HashMap.Entry<String, Date> entry = iterator.next();
            if(entry.getValue().getMonth() >= 5 && entry.getValue().getMonth() <= 7) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) throws ParseException{
        HashMap<String, Date> persons = createMap();
        removeAllSummerPeople(persons);
    }
}

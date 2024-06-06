package MyLessons.Object.Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class GetTimeInMs {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // write your code here
        Date currentTime = new Date();
        insert10000(list);
        Date afterInsert = new Date();
        long timeToInsert = afterInsert.getTime() - currentTime.getTime();
        // write your code here
        return timeToInsert;

    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}

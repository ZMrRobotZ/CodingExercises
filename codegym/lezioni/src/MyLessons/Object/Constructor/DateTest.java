package MyLessons.Object.Constructor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");
        System.out.println(dateFormat.format(new Date()));
    }
}

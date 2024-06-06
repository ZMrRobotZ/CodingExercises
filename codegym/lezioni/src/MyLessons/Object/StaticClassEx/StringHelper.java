package MyLessons.Object.StaticClassEx;

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for(int i = 0; i < 5; i++){
            result = s + result;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for(int i = 0; i < count; i++){
            result = s + result;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("ciao");
        System.out.println(str);
        str.append("ciao");
        System.out.println(str);
    }
}

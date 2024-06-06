package MyLessons.Object.StaticClassEx;

public class TestClass {

    public static String textToScreen(String text){
        text = text + " Ciao";
        return text;
    }

    public static void main(String[] args) {
        String testo = TestClass.textToScreen("Ciao");
        System.out.println(testo);
    }
}

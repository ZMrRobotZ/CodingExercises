package MyLessons.Object.StaticClassEx;

public class Cat {
    public static Cat[] cats = new Cat[10];
    public Cat() {
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            cats[i] = new Cat();
        }
        printCats();
    }

    public static void printCats() {
        for(Cat cat : cats){
            System.out.println(cat);
        }
    }
}

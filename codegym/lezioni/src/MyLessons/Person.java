package MyLessons;

public class Person {
    private String name;
    private int age;

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        Person person = new Person();
        person.initialize("Marco", 35);
    }
}

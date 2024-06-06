package MyLessons.Object.Constructor;

public class Cat {
    private String name = null;
    private int age = 5;
    private int weight = 5;
    private String address = null;
    private String color = "Unknow";

    public Cat(String name){
        this.name = name;
        age = 5;
        weight = 5;
        color = "Black";
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "Orange";
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        color = "Black";
        weight = 4;
    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 8;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 10;
    }

    public static void main(String[] args) {

    }
}

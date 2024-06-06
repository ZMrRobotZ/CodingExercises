package MyLessons.Object.TestingPack;

public class CarFactory {
    private String name;
    private int age;
    private int carsCount;

    public CarFactory(String name, int age, int carsCount){
        this.name = name;
        this.age = age;
        this.carsCount = carsCount;
    }

    public void printFactoryInfo(){
        System.out.println(this.age);
        System.out.println(this.carsCount);
    }
}

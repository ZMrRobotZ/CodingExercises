package MyLessons.Object.TestingPack;

public class TesterCarFactory {
    public static void main(String[] args) {
        CarFactory carFactory1 = new CarFactory("Ford", 50, 10000);
        carFactory1.printFactoryInfo();
    }
}

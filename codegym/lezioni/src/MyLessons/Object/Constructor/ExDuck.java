package MyLessons.Object.Constructor;

public class ExDuck {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog1);
        System.out.println(dog2);

        //write your code here
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat{
        public String toString(){
            return "Miao";
        }
    }

    public static class Dog{
        public String toString(){
            return "Bau";
        }
    }
}

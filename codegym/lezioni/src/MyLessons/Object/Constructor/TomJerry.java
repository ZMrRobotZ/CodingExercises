package MyLessons.Object.Constructor;

public class TomJerry {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog fulmineDog = new Dog("Fulmine", 30,5);
        Cat kajCat = new Cat("Kajal", 25,9);
    }
    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog{
        private String name;
        private int height;
        private int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }

    }
    public static class Cat{
        private String name;
        private int height;
        private int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

}

package MyLessons.Object.StaticClassEx;

public class CatsStatic {
    public static void main(String[] args) throws Exception{
        Cat cat1 = new Cat();
        System.out.println(Cat.catCount);
        Cat cat2 = new Cat();
        System.out.println(Cat.catCount);
        Cat cat3 = new Cat();
        System.out.println(Cat.catCount);
        Cat cat4 = new Cat();
        System.out.println(Cat.catCount);
        Cat cat5 = new Cat();
        System.out.println(Cat.catCount);
        Cat cat6 = new Cat();
        System.out.println(Cat.catCount);
        Cat cat7 = new Cat();
        System.out.println(Cat.catCount);
        Cat cat8 = new Cat();
        System.out.println(Cat.catCount);
        Cat cat9 = new Cat();
        System.out.println(Cat.catCount);
        Cat cat10 = new Cat();
        System.out.println(Cat.catCount);

    }
    public static class Cat{
        static public int catCount = 0;
        public Cat(){
            catCount++;
        }
    }
}

package MyLessons.Object.LifeCicle;

public class ZombieCatDog {

    protected void finalize() throws Throwable{
        System.out.println("A Cat was destroyed");
    }
    public static void main(String[] args) {

    }
}

class Dog {
    protected void finalize() throws Throwable{
        System.out.println("A Dog was destroyed");
    }
}

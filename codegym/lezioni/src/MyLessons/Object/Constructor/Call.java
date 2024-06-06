package MyLessons.Object.Constructor;

public class Call {
    public double x;
    public double y;
    public double radius;

    public Call(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Call(double x, double y) {
        this(x,y,10);
    }

    public Call() {
        this(5,5,1);
    }

    public static void main(String[] args) {
        Call circle = new Call();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Call anotherCircle = new Call(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}

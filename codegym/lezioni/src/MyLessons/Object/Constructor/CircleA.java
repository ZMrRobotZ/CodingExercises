package MyLessons.Object.Constructor;

public class CircleA {
    public double x;
    public double y;
    public double radius;

    public CircleA(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public CircleA(double x, double y){
        this.x = x;
        this.y = y;
        this.radius = 10;
    }

    public CircleA(CircleA circle){
        this.x = circle.x;
        this.y = circle.y;
        this.radius = circle.radius;
    }

    public CircleA(){
        this(5,5,10);
    }

    public static void main(String[] args) {

    }
}

package MyLessons.Object.StaticClassEx;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double pointDistance = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        return pointDistance;
    }

    public static void main(String[] args) {
        System.out.println(Util.getDistance(36,81,6,9));
    }
}
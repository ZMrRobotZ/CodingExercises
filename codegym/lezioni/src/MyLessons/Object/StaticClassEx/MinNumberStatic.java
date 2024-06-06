package MyLessons.Object.StaticClassEx;

public class MinNumberStatic {
    public static int step;

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        new MinNumberStatic().method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
        if (step > 1) {
            return;
        }
        main(null);
    }
}

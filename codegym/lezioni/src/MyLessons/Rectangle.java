package MyLessons;

import java.io.IOException;

public class Rectangle {
    private int top;
    private int left;
    private int width = 0;
    private int height = 0;


    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
    }

    public void initialize(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public void initialize(int top,int left,int width,int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(Rectangle rectangle){
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public String toString(){
        return  "top: " + this.top + "\n"
                + "left: " + this.left + "\n"
                + "width: " + this.width + "\n"
                + "height: " + this.height;
    }



    public static void main(String[] args) throws IOException{
        Rectangle rect1 = new Rectangle();
        rect1.initialize(1,2);
        Rectangle rect2 = new Rectangle();
        rect2.initialize(1,2,3);
        Rectangle rect3 = new Rectangle();
        rect3.initialize(1,2,3,4);
        Rectangle rect4 = new Rectangle();
        rect4.initialize(rect2);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);
        System.out.println(rect4);
    }
}

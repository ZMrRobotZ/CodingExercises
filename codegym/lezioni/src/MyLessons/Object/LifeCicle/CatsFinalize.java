package MyLessons.Object.LifeCicle;

import java.io.IOException;

public class CatsFinalize {

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.println("Die Cat");
    }

    public static void main(String[] args){

    }
}

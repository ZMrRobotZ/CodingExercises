package MyLessons.Object;

import MyLessons.Object.GetSet;

public class TestGetSet {
    public static void main(String[] args){
        GetSet pippo = new GetSet();

        pippo.setName("Pippo");
        pippo.setAge(5);

        System.out.println(pippo.getName() + " " + pippo.getAge());
    }
}

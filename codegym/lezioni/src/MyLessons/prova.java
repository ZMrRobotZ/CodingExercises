package MyLessons;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class prova {

    private String fullName;

    public void setName(String firstName, String lastName) {
        String test = firstName + " " + lastName;
        this.fullName = test;
    }

    public void showName(){
        System.out.println(fullName);
    }

    public static void main(String[] args) {
        prova prova = new prova();
        prova.setName("a","b");
        prova.showName();


    }
}


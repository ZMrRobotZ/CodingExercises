package MyLessons.Object.Array;

import java.util.ArrayList;

public class WhatSort {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();

        stringList.add("uno");
        stringList.add("due");
        stringList.add("tre");
        stringList.add("quattro");
        stringList.add("cinque");

        System.out.println(stringList.size());

        for(String element : stringList){
            System.out.println(element);
        }
    }
}

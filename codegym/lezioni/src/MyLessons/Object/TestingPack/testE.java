package MyLessons.Object.TestingPack;

import MyLessons.Object.EvenOddDigits;

public class testE {
    public static void main(String[] args) {

        int[] num = EvenOddDigits.singleNumberSplit(349, 3);
        for(int i = 0; i<3; i++){
            System.out.println(num[i]);
        }
    }
}

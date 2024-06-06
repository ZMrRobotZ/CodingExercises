package MyLessons.Object;

public class EvenOddDigits {
    public static int[] singleNumberSplit(int num, int nNum) {
        int x = 10;
        int count = 0;
        int index = 0;
        int[] aNum = new int[nNum];
        for (int i = 1; num / i > 0; i *= 10) {
            count = (num - ((num / x) * x)) / i;
            aNum[index] = count;
            index++;
            x*=10;
        }
        return aNum;

    }
}

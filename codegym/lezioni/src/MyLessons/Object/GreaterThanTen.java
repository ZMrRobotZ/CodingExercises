package cc.CodeGym.Home;

import java.util.HashSet;
import java.util.Iterator;

public class GreaterThanTen {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(10);
        numbers.add(11);
        numbers.add(190);
        numbers.add(181);
        numbers.add(7);
        numbers.add(9);
        numbers.add(1144);
        numbers.add(122);
        numbers.add(19);
        numbers.add(55);
        numbers.add(104);
        numbers.add(11222);
        numbers.add(115);
        numbers.add(18);
        numbers.add(2);
        numbers.add(93);
        numbers.add(114);
        numbers.add(12);
        return numbers;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            if(iterator.next() > 10){
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> numbers = createSet();
        System.out.println(numbers);
        removeAllNumbersGreaterThan10(numbers);
        System.out.println(numbers);
    }
}

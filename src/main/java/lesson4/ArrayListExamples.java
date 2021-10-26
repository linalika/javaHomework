package lesson4;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(100);
        integers.add(123);
        integers.add(456);
        integers.add(123);
        System.out.println(integers);
        integers.remove(Integer.valueOf(123));
        System.out.println(integers);
        integers.set(0,909);
        integers.add(0,2909);
        System.out.println(integers);
        System.out.println(integers.contains(909));
    }
}

package homework4;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        String[] names = {"Lena","Vasya","Masha","Lena","Liza","Liza","Nastya","Masha","Nikita"};
        Map<String, Integer> set = new HashMap<>();
        for (String name: names) {
            set.put(name, set.getOrDefault(name,0) +1);
        }

        System.out.println(set);

    }
}

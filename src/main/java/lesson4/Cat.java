package lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && weight == cat.weight && Objects.equals(name, cat.name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + name +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Test",1,3);
        Cat cat5 = cat1;
        cat5.setName("efew");
        Cat cat2 = new Cat("Test",2,4);
        Cat cat3 = new Cat("Test2",1,6);
        Cat cat4 = new Cat("Test2",7,9);
        System.out.println(cat1.hashCode());
        System.out.println(cat5.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat4.hashCode());
        System.out.println(cat1.getName());
        System.out.println(cat5.getName());

        HashSet<Cat> cats = new HashSet<>(Arrays.asList(cat1,cat2,cat3,cat4,cat5));
        System.out.println(cats);
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<>(Arrays.asList(1,2,45,6,74,44));
        System.out.println(integerLinkedHashSet);
    }
}

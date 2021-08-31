package lesson1;

import java.util.Objects;

public class Cat extends Animal implements CanSwim{
    public String name;
    public String color;
    private int age;
    private double swimmingSpeed;

    public Cat(String name, String color, int age) {
        if (age < 0) {
            System.out.println("Некорректный возраст");
            age = 0;

        } else {
            this.age = age;
        }
        this.name = name;
        this.color = color;

    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Некорректный возраст");
            this.age = 0;

        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Имя - " + name + ", окрас - " + color + ", возраст - " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public void voice() {
        System.out.println("кот мяукает");
    }

    public double swim(Pool pool){
        System.out.println("Кот проплывает за " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
}

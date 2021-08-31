package lesson1;

public class Turtle extends Animal implements CanSwim {
    public String name;
    public String color;
    private int age;
    private double swimmingSpeed;

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        super.voice();
    }

    public double swim(Pool pool){
        System.out.println("Кот проплывает за " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
}

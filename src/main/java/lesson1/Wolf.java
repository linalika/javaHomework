package lesson1;

public class Wolf extends Animal implements CanSwim{
    private double swimmingSpeed;
    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }
    public double swim(Pool pool){
        System.out.println("Кот проплывает за " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
}

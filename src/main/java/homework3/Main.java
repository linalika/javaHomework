package homework3;

public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange();
        Box<Orange> orangeBox1 = new Box<Orange>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        orangeBox1.getWeight();
        orangeBox2.compare(appleBox1);
        orangeBox1.addFruit(orange,5);
        orangeBox1.getWeight();

        System.out.println("orangeBox1: " + orangeBox1.getWeight());;
        System.out.println("orangeBox2: "+ orangeBox2.compare(appleBox1));
        System.out.println("orangeBox2: "+ orangeBox1.getWeight());


    }
}

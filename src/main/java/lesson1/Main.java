package lesson1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", "рыжий", 1);
       // System.out.println(cat);
        Cat cat2 = new Cat("Васька", "рыжий", 4);

      //  System.out.println(cat2);

        Animal cat3 = new Cat("Васька", "рыжий", 4);
        Animal cat4 = new Cat("Васька", "рыжий", 4);

       // System.out.println(cat3.equals(cat2));

        Animal turtle = new Turtle("Черепаха", "зеленая",35);
        System.out.println(turtle instanceof Cat);
//        turtle.voice();
//        cat.voice();
    }


}

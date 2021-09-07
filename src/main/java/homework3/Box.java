package homework3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitBox = new ArrayList<>();

    public Box(ArrayList<T> fruitBox) {
        this.fruitBox = fruitBox;
    }

    public Box() {
    }


    public float getWeight() {
        float weight = 0.0f;
        for (T unit : fruitBox) {
            weight += unit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        if (getWeight() == box.getWeight()) return true;
        return false;
    }

    public void addFruit(T fruit, int amount){
        for(int i=0;i<amount;i++){
            fruitBox.add(fruit);
        }
    }


}

package geekbrains_home_work;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class Box <T extends Fruit> implements FruitBox<T> {
    private ArrayList<T> fruits;
    private float weight;

    public Box(){
        fruits = new ArrayList<>();
    }
    public float getWeight(){
        float sum = 0;
        for (T fruit : fruits){
            sum += fruit.getWeight();
        }
        return sum;
    }

    @Override
    public void addFruit(T fruit) {
        fruits.add(fruit);

    }

    public boolean compare (Box nextBox){
        if (this.getWeight() == nextBox.getWeight()) return true;
        return false;
    }

    public void sortFruits(Box <T> nextBox){
        for (T fruit : fruits){
            nextBox.addFruit(fruit);
        }
        fruits.clear();
    }
}

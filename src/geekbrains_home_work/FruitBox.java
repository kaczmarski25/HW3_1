package geekbrains_home_work;

public interface FruitBox<T extends Fruit> {
    void addFruit(T fruit);
}

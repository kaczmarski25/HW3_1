package geekbrains_home_work;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[] array = new String[]{
            "Хороший фрукт", "Испорченный фрукт", "Фрукт для дозревания"
    };

    System.out.println("Задание 1 :");

        System.out.println("До замены: ");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        shuffleArrayElements(array, 1, 2);

        System.out.println();

        System.out.println("После замены: ");
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println();
        System.out.println("Вторая задача: ");
        System.out.println(convertToArrayList(array));

        System.out.println();
        System.out.println("Третья задача: ");

        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit( new Orange());
        orangeBox.addFruit( new Orange());

        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());

        appleBox.addFruit(new Apple());
        appleBox.addFruit( new Apple());
        appleBox.addFruit(new Apple());

        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        System.out.println("Масса первой коробки с апельсинами:" + orangeBox.getWeight());
        System.out.println("Масса второй коробки с апельсинами:" + orangeBox1.getWeight());
        System.out.println("Масса первой коробки с яблоками:" + appleBox.getWeight());
        System.out.println("Масса второй коробки с яблоками:" + appleBox1.getWeight());

        System.out.println("Сравнение массы первой коробки с апельсинами и первой коробки с яблоками:" + orangeBox.compare(appleBox));
        System.out.println("Сравнение массы первой коробки с апельсинами и  второй коробки с яблоками:" + orangeBox.compare(appleBox1));
        System.out.println("Сравнение массы второй коробки с апельсинами и первой коробки с яблоками:" + orangeBox1.compare(appleBox));
        System.out.println("Сравнение массы второй коробки с апельсинами и второй коробки с яблоками:" + orangeBox1.compare(appleBox1));

        orangeBox.sortFruits(orangeBox1);
        System.out.println("Вес первой коробки с апельсинами после сортировки: " + orangeBox.getWeight());
        System.out.println("Вес второй коробки с апельсинами после сортировки: " + orangeBox1.getWeight() );

        appleBox.sortFruits(appleBox1);
        System.out.println("Вес первой коробки с яблоками после сортировки : " + appleBox.getWeight());
        System.out.println("Вес второй коробки с яблоками после сортировки : " + appleBox1.getWeight()) ;

    }



    static <T> T [] shuffleArrayElements(T[] array, int indexFirst, int indexSecond){
        T buffer;
        buffer = array[indexFirst];
        array[indexFirst] = array[indexSecond];
        array[indexSecond] = buffer;
        return array;
    }

    static <T> ArrayList<T> convertToArrayList(T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }




}

package exam05;

import java.util.ArrayList;

public class juicer<T> {
    private T item;
   public static void make(FruitBox<? extends Fruit> fruitBox) {
       ArrayList<?> items = fruitBox.get();
       System.out.println(items);
/*
        public static void make(FruitBox<? super Fruit> fruitBox){
            ArrayList<?> items =  fruitBox.get();
            System.out.println(items);

*/
   }
   public static <T extends Fruit> void make2(FruitBox<T> fruitBox){
       ArrayList<T> items = fruitBox.get();
       System.out.println(items);
   }
}

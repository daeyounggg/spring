package exam05;

public class ex01 {
    public static void main(String[] args){
        FruitBox<Fruit> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        juicer.make(appleBox);

        FruitBox<Fruit> melonBox = new FruitBox<>();
        melonBox.add(new Melon());
        melonBox.add(new Melon());
        melonBox.add(new Melon());

        juicer.make(melonBox);

        /*
        FruitBox<Toy> toyBox = new FruitBox<>();
        toyBox.add(new Toy());


        juicer.make(toyBox);
        */
    }
}

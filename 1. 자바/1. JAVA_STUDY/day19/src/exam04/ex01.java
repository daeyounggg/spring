package exam04;

public class ex01 {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.put(new Apple());
        appleBox.showInfo();


        Box<Melon> melonBox = new Box<>();
        melonBox.put(new Melon());
        melonBox.showInfo();
    }
}


package exam02;

public class ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.put(new Apple());
        Apple apple = (Apple) appleBox.get();
        apple.showInfo();

        Box melonBox = new Box();
        melonBox.put(new Melon());
        Melon melon = (Melon) melonBox.get();
        melon.showInfo();
    }
}

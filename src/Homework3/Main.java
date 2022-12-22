package Homework3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание");

        Flower roza = new Flower(null, "Голландия", 35.59);
        System.out.print("Роза обыкновенная. ");
        roza.infoAboutFlower();
        Flower chrysa = new Flower(null, null, 15, 5);
        System.out.print("Хризантема. ");
        chrysa.infoAboutFlower();
        Flower peony = new Flower(null, "Англия", 69.9, 1);
        System.out.print("Пион. ");
        peony.infoAboutFlower();
        Flower gypsa = new Flower(null, "Турция", 19.5, 10);
        System.out.print("Гипсофила. ");
        gypsa.infoAboutFlower();
    }
}





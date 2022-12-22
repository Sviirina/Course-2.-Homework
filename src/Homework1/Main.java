package Homework1;

public class Main {
    public static void main (String[] args) {
        int currentYear = 2022;

        Human max = new Human(-1988, "Максим", null, "бренд-менеджер");
        max.toWelcome();

        Human ann = new Human(1993, null, "Москва", "методист образовательных программ");
        ann.toWelcome();

        Human kat = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        kat.toWelcome();

        Human artem = new Human(1995, "Артем", "Москва", null);
        artem.toWelcome();

        Human vlad = new Human(currentYear-21, "Владимир", "Казань", null);
        vlad.toWelcome();




    }
}

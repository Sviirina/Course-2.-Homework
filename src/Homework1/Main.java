package Homework1;

public class Main {
    public static void main (String[] args) {

        Human max = new Human(-1988, "Максим", "Минск", "бренд-менеджер");
        max.toWelcome();

        Human ann = new Human(1993, null, "Москва", "методист образовательных программ");
        ann.toWelcome();

        Human kat = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        kat.toWelcome();

        Human artem = new Human(1995, "Артем", "Москва", null);
        artem.toWelcome();


    }
}

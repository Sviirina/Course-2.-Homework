package Homework2;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        car1.characteristicsCar();

        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
        car2.characteristicsCar();

        Car car3 = new Car("BMW", null, 3.0, "черный", 2021, "Германия");
        car3.characteristicsCar();

        Car car4 = new Car("Kia", "Sportage 4-го поколения", 0, "красный", 2018, "Южная Корея");
        car4.characteristicsCar();

        Car car5 = new Car(null, "Avante", 1.6, "оранжевый", 0, "Южная Корея");
        car5.characteristicsCar();
    }

}

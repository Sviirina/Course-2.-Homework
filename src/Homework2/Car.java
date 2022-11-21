package Homework2;

public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null){
            this.country = "default";
        } else {
            this.country = country;
        }
    }

      void characteristicsCar() {
            System.out.println("Марка автомобиля: " + brand +" , модель: " + model + ", " + year + " год выпуска, сборка в стране: " + country + ", " + color + " цвет, объем двигателя - " + engineVolume + " л.");
        }
}

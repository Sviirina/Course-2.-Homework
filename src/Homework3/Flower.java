package Homework3;

public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor != null) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
        if (country != null) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <=0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost, 3);
    }


    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    void infoAboutFlower(){
        System.out.println("Цвет: " + flowerColor + ". Страна происхождения: " + country + ". Стоимость: " + cost + ". Срок стояния цветка: " + lifeSpan + " дней.");
    }
}

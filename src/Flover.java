public class Flover {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public String getFlowerName() {
        return flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isBlank()) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public void setFlowerName(String flowerName) {
        if (flowerName == null || flowerName.isBlank()) {
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public Flover(String flowerName, String country, String flowerColor, double cost, int lifeSpan) {
        setFlowerName(flowerName);
        setCountry(country);
        setFlowerColor(flowerColor);
        setCost(cost);
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    void flovers() {
        System.out.println("Название цветка " + flowerName + ", Страна производитель " + country + ", Цвет " + flowerColor +
                ", цена " + cost + " руб, " + lifeSpan + " дней, срок стояния ");
    }
}

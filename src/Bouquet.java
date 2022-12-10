import java.util.Arrays;

public class Bouquet {
    private final Flover[] flovers;

    public Bouquet(Flover[] flovers) {
        this.flovers = flovers;
    }

    private double calkuletCost() {
        double summ = 0;
        for (Flover flover : flovers) {
            summ += flover.getCost();
        }
        return summ*1.1;
    }
    private int calkuletLiveSpan() {
        int minLife = Integer.MAX_VALUE;
        for (Flover flover : flovers) {
            if (flover.getLifeSpan() < minLife) {
                minLife = flover.getLifeSpan();
            }
        }
        return minLife;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(" Состав букета: ").append("\n");
        double summ = calkuletCost();
        int minLife = calkuletLiveSpan();
        for (Flover flover : flovers) {
            result.append(flover.getFlowerName()).append("\n");
        }
        result.append("Срок стояния букета ").append(minLife).append(" дней ");
        result.append("Стоимость букета ").append(summ).append(" рублей ");
        return result.toString();
    }
}

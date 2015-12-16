package ColorToShape;

/**
 * Created by Ольга on 16.12.2015.
 */
public class Color {
    private String name;
    private double consumption;
    private double cost;

    public Color(double cost, double consumption, String name) {
        this.cost = cost;
        this.consumption = consumption;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getConsumption() {
        return consumption;
    }

    public double getCost() {
        return cost;
    }
}

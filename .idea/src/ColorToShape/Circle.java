package ColorToShape;

/**
 * Created by Ольга on 16.12.2015.
 */
public class Circle extends Shape {
    private double radius;
    public Circle(String name, ColorToShape.Color color, double radius) {
        super(name, color);
        this.radius = radius;
    }
    public double area(){
        return 3.1415*radius*radius;
    }
}

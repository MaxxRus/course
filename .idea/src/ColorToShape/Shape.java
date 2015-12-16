package ColorToShape;

/**
 * Created by Ольга on 16.12.2015.
 */
public abstract class Shape {
    private String name;
    private Color color;

    public Shape(String name, ColorToShape.Color color) {
        this.name = name;
        this.color = color;
    }

    abstract void area();
}

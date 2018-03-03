package Q1_shape;

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape area " + getArea() +", perimeter "+getPerimeter();
    }
    
    
}

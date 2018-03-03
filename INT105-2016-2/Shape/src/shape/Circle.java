package shape;


public class Circle extends Shape{
    private double radius;
    
    public Circle(String color, double radius){
        super(color);
        this.radius=radius;
        this.setType(Shape.ShapeType.Circle);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
}


package G4.Lecture06;

public class Rectangle extends Shape {
    private double width;
    private double high;

    public Rectangle(double width, double high) {
        super("White");
        this.width = width;
        this.high = high;
    }
    
    public Rectangle(String color, double width, double high) {
        super(color);
        this.width = width;
        this.high = high;
    }
    
    public double getArea(){
        return this.high*this.width;
    }

    @Override
    public String toString() {
        return "Rectangle " + " width: " + width + ", high: " + high + "\tArea: "+this.getArea()+"\t"+super.toString();
    }

    @Override
    public double getPerimeter() {
        return 2*(this.high+this.width);
    }
    
    
    
}

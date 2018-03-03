package Q1_shape;

public class Rectangle extends Shape{
    private double width,height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return width*height;
    }

    @Override
    public double getPerimeter() {
       return 2*(width+height); 
    }
}

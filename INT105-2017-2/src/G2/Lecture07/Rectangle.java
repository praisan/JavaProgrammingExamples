package G2.Lecture07;

public class Rectangle extends ColorShape {

    private double width;
    private double high;

    public Rectangle(double width, double high) {
        this("White", width, high);
    }

    public Rectangle(String color, double width, double high) {
        super(color);
        this.width = width;
        this.high = high;
    }

    public double getArea() {
        return this.high * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.high + this.width);

    }
    
    public boolean equals(Object obj){
        boolean result=false;
        if(obj !=null && obj instanceof Rectangle){
            Rectangle temp=(Rectangle)obj; // change type
            result=(this.high==temp.high && this.width==temp.width);
//            if(this.high==temp.high && this.width==temp.width){
//                result=true;
//            }
            
        }
        return result;
    }
    

}

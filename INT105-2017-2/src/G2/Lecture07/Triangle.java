package G2.Lecture07;

public class Triangle implements Shape, Comparable<Shape> {

    private double line1, line2, line3;

    public Triangle(double line1, double line2, double line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return this.line1+this.line2+this.line3;
    }
    
   public int compareTo(Shape she02) {

        int result = -99;
        if (she02 != null && she02 instanceof Shape) {
            if (this.getArea() < she02.getArea()) {
                result = -1;
            } else if (this.getArea() == she02.getArea()) {
                result = 0;
            } else {
                result = 1;
            }
//            result = (int) (this.getArea() - she02.getArea());
        }
        return result;
    }



}

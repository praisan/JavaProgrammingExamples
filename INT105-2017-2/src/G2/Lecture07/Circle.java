package G2.Lecture07;

public final class Circle extends ColorShape {

    private double radius;

    public Circle(double radius) {
        this("White", radius);
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }


    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null && obj instanceof Circle) {
            Circle temp = (Circle) obj;
            if (this.radius == temp.radius) {
                result = true;
            }
        }
        return result;
    }

}

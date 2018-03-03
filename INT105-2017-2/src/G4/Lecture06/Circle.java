package G4.Lecture06;

public  class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("White");
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle " + " radius: " + radius + "\t Area: " + this.getArea() + super.toString();
    }

    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null && obj instanceof Circle) {
            Circle temp = ((Circle) obj);
            if (this.radius == temp.getRadius()) {
                result = true;
            }
        }

        return result;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

}

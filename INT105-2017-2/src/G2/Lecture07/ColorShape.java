package G2.Lecture07;

public abstract class ColorShape implements Shape, Comparable<Shape> {

    private String color;

    public ColorShape(String color) {
        this.color = color;
    }

    public final String getColor() {
        return color;
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

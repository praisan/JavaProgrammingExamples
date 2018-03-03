package Q1_shape;

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[4];
        shapes[0]=new Circle(9);
        shapes[1]=new Rectangle(3,10);
        
        System.out.println(shapes[0]);
        System.out.println(shapes[1]);
    }    
}

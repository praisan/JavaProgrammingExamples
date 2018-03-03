package G4.Lecture06;

public class TestShape {

    public static void main(String[] args) {
        Shape shape01 = new Circle(10);
        Shape shape02 = new Rectangle(10, 20);
        Shape shape03 = new Circle(10);
        
        System.out.println("----------------------------");
        System.out.println(shape01.compareTo(shape01));
        System.out.println(shape01.compareTo(shape02));
        System.out.println(shape02.compareTo(shape01));
        System.out.println("----------------------------");
        
        
        
        
        ColorAble[] shapes=new ColorAble[4];
        shapes[0]=shape01;
        shapes[1]=shape02;
        shapes[2]=shape03;
        shapes[3]=new Cat("Aha","Black");
        
        showColor(shapes);
   }

    public static void showColor(ColorAble[] obj) {
        for (int i = 0; i < obj.length; i++) {
            System.out.println("object " + i + " - color: " + obj[i].getColor());

        }

    }

}

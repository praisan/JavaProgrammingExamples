
package shape;

import java.util.Iterator;

/**
 *
 * @author luffy
 */
public class TestShape2 {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[4];
        shapes[0]=new Circle("Green",10);
        shapes[1]=new Circle("Blue",5);
        shapes[2]=new Rectangle("Green",10,5);
        shapes[3]=new Rectangle("Green",10,20);
        
        for(Shape obj:shapes){
            System.out.println(obj.toString());
        }
        
        System.out.println("--------------");
        
        
        Shape2 shapes2=new Shape2(shapes);
        
        while(shapes2.hasNext()){
            System.out.println(shapes2.next().toString());
        }
        
        
        System.out.println("--Test foreach--------------");
        
        for(Shape obj:shapes2){
            System.out.println(obj.toString());
        }
    }
    
}

package shape;

import java.util.Arrays;

/**
 *
 * @author luffy
 */
public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[4];
        shapes[0]=new Circle("Green",10);
        shapes[1]=new Circle("Blue",5);
        shapes[2]=new Rectangle("Green",10,5);
        shapes[3]=new Rectangle("Green",10,20);
        
        
        new Rectangle("Green",10,5);
        new Rectangle("Green",10,5);
        
        int[] x={5,7,2,5,8,15,8};
        int min=x[0];
        
        for(int i=1;i<x.length;i++){
            if(min>x[i]){
                min=x[i];
            }
        }
        System.out.println("minimum: "+min);
        
        for(int i=0;i<x.length;i++){
            System.out.println("i= "+i+" value= "+x[i]);
        }
        Arrays.sort(x);
        for(int i=0;i<x.length;i++){
            System.out.println("i= "+i+" value= "+x[i]);
        }
        
        Shape minShape=shapes[0];
        for(int i=1;i<shapes.length;i++){
           if(minShape.compareTo(shapes[i])>0){
               minShape=shapes[i];
           }
        }
        System.out.println(minShape.toString());
        
        System.out.println("Before sort:");
        for(int i=0;i<shapes.length;i++){
            System.out.println(shapes[i].toString());
        }
        
        Arrays.sort(shapes);
        
        System.out.println("After sort:");
        for(int i=0;i<shapes.length;i++){
            System.out.println(shapes[i].toString());
        }
    }    
}

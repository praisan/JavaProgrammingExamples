package shape;

import java.util.*;

public class Shape2 implements Iterator<Shape>, Iterable<Shape> {
    Shape[] shapes;
    private int ind=-1;
    
    public Shape2(Shape[] shapes){
        this.shapes=shapes;        
    }
    
    public Shape2(){
        shapes=new Shape[5];
        shapes[0]=new Circle("Green",3);
        shapes[1]=new Circle("Green",5);
        shapes[2]=new Rectangle("Green",3,5);
        shapes[3]=new Rectangle("Green",10,12);
        shapes[4]=new Rectangle("Green",2,2.5);
    }

    @Override
    public boolean hasNext() {
        return ind<(shapes.length-1);
    }

    @Override
    public Shape next() {
        ind++;
        return shapes[ind];
    }

    @Override
    public Iterator<Shape> iterator() {
        ind=-1;
        return this;
    }
    
}

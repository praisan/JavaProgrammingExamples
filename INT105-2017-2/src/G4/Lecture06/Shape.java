
package G4.Lecture06;

public abstract class Shape implements ColorAble, Comparable<Shape>{
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    
    public final String getColor() {
        return color;
    }
    
    public void fillColor(String color){
        this.color=color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();


    @Override
    public String toString() {
        return "\tColor: " + color ;
    }
    
    public int compareTo(Shape obj){
        int result;
        if(this.getArea()<obj.getArea()){
            result=-1;
        }else if(this.getArea()>obj.getArea()){
            result=1;
        }else{
            result=0;
        }
        return result;
        
    }
    
    
}

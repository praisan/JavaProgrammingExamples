/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author luffy
 */
public class Rectangle extends Shape{
    private double width;
    private double height;
    
    public Rectangle(String color,double width,double height){
        super(color);
        this.width=width;
        this.height=height; 
        this.setType(Shape.ShapeType.Rectangle);
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {        
        return 2*(width+height);
    }
    
}

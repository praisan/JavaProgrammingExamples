package Q2_mouse;

public abstract class Mouse {
    private String color;

    public Mouse(String color) {
        this.color = color;
    }
    
    public void leftClick(){
        System.out.println(color+" mouse >> Click");
    }
    
    public void rightClick(){
        System.out.println(color+" mouse >> Context Menu");
    }
    
    public void scoll(int step){
        String temp;
        temp=(step>=0)?"Up ":"Down ";
        System.out.println(temp+step*3 + " lines");
    }

    @Override
    public String toString() {
        return  color + " mouse";
    }
    
}

package Q2_mouse;

public class MouseApp {
    public static void main(String[] args) {
        Mouse[] mouses=new Mouse[3];
        
        mouses[0]=new WireMouse("Green",1.5,"USB Type-C");
        mouses[1]=new WirelessMouse("Yellow",2.4);
        mouses[2]=new WirelessMouse("Blue",5);
        
        for(Mouse mouse:mouses){
            System.out.println(mouse.toString());
        }        
        mouses[0].rightClick();
        mouses[1].rightClick();
        mouses[0].scoll(-5);
        mouses[1].scoll(-5);        
    }    
}

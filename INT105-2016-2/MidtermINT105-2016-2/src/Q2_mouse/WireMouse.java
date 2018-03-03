package Q2_mouse;

public class WireMouse extends Mouse {
    private double cableLength;
    private String connector;

    public WireMouse(String color,double cableLength, String connector) {
        super(color);
        this.cableLength = cableLength;
        this.connector = connector;
    }

    @Override
    public String toString() {
        return super.toString()+" - Wire mouse with cable length " + cableLength + " m, " + connector+" connector";
    }
    
    
    
        
    
    
}

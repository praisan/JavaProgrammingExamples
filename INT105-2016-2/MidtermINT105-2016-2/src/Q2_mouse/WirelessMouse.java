package Q2_mouse;

public class WirelessMouse extends Mouse{
    private double signalFreqInGhz;

    public WirelessMouse(String color,  double signalFreqInGhz) {
        super(color);
        this.signalFreqInGhz = signalFreqInGhz;
    }

    @Override
    public String toString() {
        return super.toString()+" - Wireless mouse with " + signalFreqInGhz + " Ghz wireless technology";
    }
}

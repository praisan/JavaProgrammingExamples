
package heroesbattle;

public class Weapon {
    private String name;
    private int power;

    public Weapon(String name, int power) {
        this.power=power;
        this.name=name;        
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Weapon{" + "name=" + name + ", power=" + power + '}';
    }
    
    
}

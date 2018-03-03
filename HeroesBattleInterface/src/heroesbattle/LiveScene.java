
package heroesbattle;

public class LiveScene extends BeAlive implements CanBeAttacked{
    private Armor armor;

    public LiveScene(String name, int health,Armor armor) {
        super(name, health);
        this.armor = armor;
    }

    @Override
    public void beAttacked(CanAttack obj) {
        this.changeHealth(obj.getAttackPower() - this.armor.useArmor());
    }
    
    
}

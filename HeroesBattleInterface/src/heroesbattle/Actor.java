package heroesbattle;

public class Actor extends BeAlive implements CanAttack, CanBeAttacked {
    
    private Weapon weapon;
    private Armor armor;
    
    public Actor(String name, int health, Armor armor, Weapon weapon) {
        super(name, health);
        this.weapon = weapon;
        this.armor = armor;
    }
    
    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public void changeArmor(Armor armor) {
        this.armor = armor;
    }
    
    public Weapon getWeapon() {
        return weapon;
    }
    
    public Armor getArmor() {
        return armor;
    }
    
    @Override
    public int getAttackPower() {
        return this.weapon.getPower();
    }
    
    @Override
    public void beAttacked(CanAttack obj) {
        this.changeHealth(obj.getAttackPower() - this.armor.useArmor());
    }
    
}

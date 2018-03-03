package heroesbattle;

public class Hero {

    private String name;
    private int health;
    private Armor armor;
    private Weapon weapon;

    public Hero(String name, int health, Armor armor, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return weapon.getPower();
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void changeArmor(Armor armor) {
        this.armor = armor;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attacked(int power) {
        this.health -= power - armor.getArmor();
    }

    public void attacked(Hero enemy) {
        this.health -= enemy.getAttackPower() - armor.getArmor();
    }

    @Override
    public String toString() {
        return "Hero{" + "name=" + name + ", health=" + health + ", armor=" + armor + ", weapon=" + weapon + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesbattle;

/**
 *
 * @author Praisan.pad
 */
public class BeAlive {

    private String name;
    private int health;

    public BeAlive(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void changeHealth(int amount) {
        this.health-=amount;
    }
    

}

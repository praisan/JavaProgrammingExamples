/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesbattle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Praisan.pad
 */
public class HeroesBattleTest {

    @Test
    public void armorPowerCanBeSetAndGet() {
        Armor batSuit = new Armor("Bat suit", 50);
        int expected = 50;
        assertEquals(expected, batSuit.useArmor());
    }

    @Test
    public void weaponPowerCanBeSetAndGet() {
        Weapon batarangs = new Weapon("Batarangs", 500);
        int expected = 500;
        assertEquals(expected, batarangs.getPower());
    }

    @Test
    public void heroCanBeAttackedByHero() {
        Actor batman = new Actor("Batman", 1500, new Armor("Bat suit", 50), new Weapon("Batarangs", 500));
        Actor spiderman = new Actor("Spider-Man", 5000, new Armor("Spider suit", 30), new Weapon("Web-Shooters", 200));
        batman.beAttacked(spiderman);

        int expected = 1350;
        assertEquals(expected, batman.getHealth());
    }

    @Test
    public void weaponOfHeroCanBeChanged() {
        Weapon batarangs = new Weapon("Batarangs", 500);
        Actor batman = new Actor("Batman", 1500, new Armor("Bat suit", 50), new Weapon("Flash-Bang Grenades", 2000));
        batman.changeWeapon(batarangs);

        int expected = 500;
        assertEquals(expected, batman.getAttackPower());
    }

    @Test
    public void armorOfHeroCanBeChanged() {
        Armor batSuit = new Armor("Bat suit", 50);
        Actor batman = new Actor("Batman", 1500, new Armor("sweater", 5), new Weapon("Flash-Bang Grenades", 2000));
        batman.changeArmor(batSuit);

        int expected = 50;
        assertEquals(expected, batman.getArmor().useArmor());
    }

    @Test
    public void armorDamage20PercentAfterUsed() {
        Actor batman = new Actor("Batman", 1500, new Armor("Bat suit", 50), new Weapon("Batarangs", 500));
        Actor spiderman = new Actor("Spider-Man", 5000, new Armor("Spider suit", 30), new Weapon("Web-Shooters", 200));
        batman.beAttacked(spiderman);

        int expected = (int)(50*.8);
        assertEquals(expected, batman.getArmor().useArmor());
    }
    
    @Test
    public void environmentCanbeAttacked() {
        LiveScene tree = new LiveScene("Tree", 1000, new Armor("Bark", 10));
        Actor spiderman = new Actor("Spider-Man", 5000, new Armor("Spider suit", 30), new Weapon("Web-Shooters", 200));
        tree.beAttacked(spiderman);
        tree.beAttacked(spiderman);
        
        int expected = 1000-200-200+10+8;
        assertEquals(expected, tree.getHealth());
    }
}

package ro.csie.ase.models;

import ro.csie.ase.abstracts.AWeapon;
import ro.csie.ase.abstracts.IAttackable;
import ro.csie.ase.abstracts.IDefendable;

import java.util.Random;

public class GameCharacter {

    String name;
    int hitPoints;
    int healthPoints;
    AWeapon weapon;

    public static int MAX_DMG = 15;

    public GameCharacter(String name, int hitPoints, int healthPoints, AWeapon weapon) { // constructor injection
        this.name = name;
        this.hitPoints = hitPoints;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public AWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(AWeapon weapon) { // setter injection
        this.weapon = weapon;
    }

    public void play(){
        weapon.use(new Random().nextInt(MAX_DMG));
    }

    public void play2(){
        if( weapon instanceof IAttackable){
            ((IAttackable) weapon).attack(new Random().nextInt(MAX_DMG));
        }
        if( weapon instanceof IDefendable){
            ((IDefendable) weapon).defend(new Random().nextInt(MAX_DMG));
        }

    }
}

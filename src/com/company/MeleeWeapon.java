package com.company;

public class MeleeWeapon extends Weapon{
    public MeleeWeapon(String name, String description, int damage){
        super(name, description, damage);
    }
    public int usesLeft(){
        return 999;
    }
}

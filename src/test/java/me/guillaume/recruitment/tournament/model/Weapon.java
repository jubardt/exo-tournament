package me.guillaume.recruitment.tournament.model;

public class Weapon {
    protected int damage;
    protected String name;

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }


    public void attack(Fighter fighter){
        fighter.dealDamage(damage);
    }
}

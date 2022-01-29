package me.guillaume.recruitment.tournament.model;

public class Weapon {
    private int damage;
    private String name;

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }


    public void attack(Fighter fighter){
        fighter.dealDamage(damage);
    }
}

package me.guillaume.recruitment.tournament.model;

public class Weapon {
    protected int damage;
    protected String name;

    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;
    }


    public void attack(Fighter fighter, boolean isArmored){
        if(isArmored){
            //System.err.println("Je fais moins de dégat avec mon armure");
            fighter.dealDamage(damage-1);
        }else{
            fighter.dealDamage(damage);
        }
    }

    public boolean canAttack(){
        return true;
    }

    public void majAttack(){
    }
}

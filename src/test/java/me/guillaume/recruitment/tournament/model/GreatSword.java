package me.guillaume.recruitment.tournament.model;

public class GreatSword extends Weapon{
    public int nbCoup;
    public GreatSword() {
        super("Great Sword", 12);
        nbCoup = 0;
    }

    @Override
    public void attack(Fighter opponent, boolean isArmored){
        nbCoup++;
        if(nbCoup%3!=0){
            if(isArmored){
                opponent.dealDamage(damage-1);
            }else{
                opponent.dealDamage(damage);
            }
        }
    }

    @Override
    public boolean canAttack(){
        return ((nbCoup+1)%3!=0);
    }

    @Override
    public void majAttack(){
        nbCoup++;
    }
}

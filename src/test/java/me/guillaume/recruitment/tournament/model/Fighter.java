package me.guillaume.recruitment.tournament.model;

public class Fighter {

    private int hitPoints;
    private Weapon weapon;

    public Fighter(int hitPoints , String weapon, int weaponDamage){
        this.hitPoints = hitPoints;
        this.weapon = new Weapon(weapon,weaponDamage);
    }


    public int hitPoints(){
        return hitPoints;
    }

    public void engage(Fighter opponent){
        boolean finCombat = false;
        boolean tour = false;
        while(finCombat!=true){
            if(tour!=true){
                attack(opponent);
                tour = true;
            }else{
                opponent.attack(this);
                tour = false;
            }
            if(hitPoints() == 0 || opponent.hitPoints() == 0){
                finCombat = true;
            }
        }
    }

    public void attack(Fighter fighter){
        weapon.attack(fighter);
    }

    public void dealDamage(int damage){
        hitPoints = hitPoints-damage;
        if(hitPoints <0){
            hitPoints = 0;
        }
    }
}

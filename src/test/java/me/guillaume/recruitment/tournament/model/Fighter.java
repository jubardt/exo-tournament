package me.guillaume.recruitment.tournament.model;

public class Fighter {

    protected int hitPoints;
    protected Weapon weapon;
    protected Equipment equipmentHand;
    protected boolean hasArmor;

    public Fighter(int hitPoints , String weapon, int weaponDamage){
        this.hitPoints = hitPoints;
        this.weapon = new Weapon(weapon,weaponDamage);
        this.equipmentHand = null;
        this.hasArmor = false;
    }

    public Fighter(int hitPoints, Weapon weapon){
        this.hitPoints = hitPoints;
        this.weapon = weapon;
        this.hasArmor = false;
    }


    public int hitPoints(){
        return hitPoints;
    }

    public void engage(Fighter opponent){
        boolean finCombat = false;
        boolean tour = false;
        while(!finCombat){
            if(!tour){
                if(opponent.equipmentHand !=null){
                    opponent.action(this);
                }else{
                    attack(opponent);
                }
                tour = true;
            }else{
                if(equipmentHand !=null){
                    action(opponent);
                }else{
                    opponent.attack(this);
                }
                tour = false;
            }
            if(hitPoints() == 0 || opponent.hitPoints() == 0){
                finCombat = true;
            }
        }
    }

    public void attack(Fighter fighter){
        weapon.attack(fighter,hasArmor);
    }

    public void dealDamage(int damage){
        if(hasArmor){
            hitPoints = hitPoints-(Math.max(damage - 3, 0));
        }else{
            hitPoints = hitPoints-damage;
        }
        if(hitPoints < 0){
            hitPoints = 0;
        }
    }

    public void destroyEquip(){
        equipmentHand = null;
    }

    public void action(Fighter opponent){
        if(equipmentHand!=null){
            equipmentHand.action(opponent);
        }
    }
}

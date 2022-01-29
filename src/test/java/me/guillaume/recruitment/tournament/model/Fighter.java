package me.guillaume.recruitment.tournament.model;

public class Fighter {

    protected int hitPoints;
    protected Weapon weapon;
    protected Equipment equipment;

    public Fighter(int hitPoints , String weapon, int weaponDamage){
        this.hitPoints = hitPoints;
        this.weapon = new Weapon(weapon,weaponDamage);
        this.equipment = null;
    }


    public int hitPoints(){
        return hitPoints;
    }

    public void engage(Fighter opponent){
        boolean finCombat = false;
        boolean tour = false;
        while(!finCombat){
            if(!tour){
                if(equipment!=null){
                    action(opponent);
                }else{
                    attack(opponent);
                }
                tour = true;

            }else{
                if(opponent.equipment !=null){
                    opponent.action(this);
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
        weapon.attack(fighter);
    }

    public void dealDamage(int damage){
        hitPoints = hitPoints-damage;
        if(hitPoints < 0){
            hitPoints = 0;
        }
    }

    public void destroyEquip(){
        equipment = null;
    }

    public void action(Fighter opponent){
        if(equipment!=null){
            equipment.action(opponent);
        }
    }
}

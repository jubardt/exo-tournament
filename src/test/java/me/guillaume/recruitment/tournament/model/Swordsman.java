package me.guillaume.recruitment.tournament.model;

public class Swordsman extends Fighter {

    public Swordsman() {
        super(100, "1 hand sword", 5);
    }

    public Swordsman equip(String equipmentName){
        if(equipmentName.equals("buckler")){
            this.equipmentHand = new Buckler(this);
        }else if(equipmentName.equals("armor")){
            this.hasArmor = true;
        }
        return this;
    }
}

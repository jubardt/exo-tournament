package me.guillaume.recruitment.tournament.model;

public class Highlander extends Fighter{
    public Highlander() {
        super(150, new GreatSword());
    }

    public Highlander equip(String equipmentName){
        if(equipmentName.equals("buckler")){
            this.equipmentHand = new Buckler(this);
        }else if(equipmentName.equals("armor")){
            this.hasArmor = true;
        }
        return this;
    }
}

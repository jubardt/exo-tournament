package me.guillaume.recruitment.tournament.model;

public class Viking extends Fighter {

    public Viking() {
        super(120, "1 hand axe", 6);
    }



    public Viking equip(String equipmentName){
        if(equipmentName.equals("buckler")){
            this.equipmentHand = new Buckler(this);
        }else if(equipmentName.equals("armor")){
            this.hasArmor = true;
        }
        return this;
    }
}

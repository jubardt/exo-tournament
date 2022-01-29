package me.guillaume.recruitment.tournament.model;

public class Viking extends Fighter {

    public Viking() {
        super(120, "1 hand axe", 6);
    }



    public Viking equip(String equipmentName){
        switch (equipmentName){
            case "buckler":
                this.equipment = new Buckler(this);
        }
        return this;
    }
}

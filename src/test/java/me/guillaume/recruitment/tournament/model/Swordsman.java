package me.guillaume.recruitment.tournament.model;

public class Swordsman extends Fighter {

    public Swordsman() {
        super(100, "1 hand sword", 5);
    }

    public Swordsman equip(String equipmentName){
        switch (equipmentName){
            case "buckler":
                this.equipment = new Buckler(this);
        }
        return this;
    }
}

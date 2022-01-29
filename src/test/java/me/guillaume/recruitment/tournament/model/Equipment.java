package me.guillaume.recruitment.tournament.model;

public class Equipment {
    protected String name;
    protected Fighter fighter;


    public Equipment(String name,Fighter fighter){
        this.name = name;
        this.fighter = fighter;
    }

    public void action(Fighter opponent){

    }

    public void destroyEquip(){
        fighter.destroyEquip();
    }
}

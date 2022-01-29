package me.guillaume.recruitment.tournament.model;

public class Buckler extends Equipment{

    private Boolean previousBlocked;
    private int numberBlocked;


    public Buckler(Fighter fighter) {
        super("buckler",fighter);
        previousBlocked = false;
        numberBlocked = 0;
    }

    @Override
    public void action(Fighter opponent){
        if(previousBlocked){
            this.fighter.attack(opponent);
            previousBlocked = false;
        }else{
            previousBlocked = true;
            numberBlocked++;
            System.err.println("Bloque !!!!!");
        }

        if(numberBlocked == 3){
            if(opponent.weapon.name.contains("axe")){
                this.fighter.destroyEquip();
            }
        }
    }
}

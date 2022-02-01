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
        if(opponent.weapon.canAttack()){
            if(previousBlocked){
                opponent.attack(this.fighter);
                previousBlocked = false;
            }else{
                previousBlocked = true;
                numberBlocked++;
                opponent.weapon.majAttack();
            }
        }else{
            opponent.weapon.majAttack();
        }


        if(numberBlocked == 3){
            if(opponent.weapon.name.contains("axe")){
                this.fighter.destroyEquip();
                //System.err.println("Bouclier détruit !");
            }
        }
    }

    @Override
    public boolean canProtect(){
        return previousBlocked&&false;
    }
}

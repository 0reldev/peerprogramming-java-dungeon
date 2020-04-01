import java.util.Random;

public class Wizard extends Adventurer{


    private int intelligence; 

    public Wizard(String name){
        super (name);
        Random randomGenerator = new Random();
        this.intelligence = randomGenerator.nextInt(11) + 1;
    }

    // Getters
    public int getIntelligence() {
        return this.intelligence;
    }

    // Setters
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    // méthode
    @Override
    public void open(Treasure chest){
        if(chest.getSpellResistance()<= this.intelligence){
            this.setMoney(this.getMoney() + chest.getGold());
            System.out.println(this.getName() + " opens the chest! He now has " + this.getMoney()+ " coins.");
        } else {
            System.out.println(this.getName() + " failed. The treasure is magically destroyed!");
        
    }


    }
}

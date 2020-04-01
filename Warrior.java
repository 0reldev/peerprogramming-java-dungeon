import java.util.Random;

public class Warrior extends Adventurer {

    private int strength;

    public Warrior( String name) {
        super(name);
        Random randomGenerator = new Random();
        this.strength = randomGenerator.nextInt(11)+1;
    }

    public int getStrength() {
        return this.strength;
    }

    @Override
    public void open(Treasure chest) {
        if (chest.getPickResistance() <= this.strength) {
            this.setMoney(this.getMoney() + chest.getGold());
            System.out.println(this.getName() + " opens the chest! He now has " + this.getMoney()+ " coins.");
        } else {
            System.out.println(this.getName() + " failed. The treasure is magically destroyed!");
        }
        
    }


}
import java.util.Random;

public class Thief extends Adventurer {

    private int dexterity;

    public Thief(String name) {

        super(name);
        Random randomGenerator = new Random();
        this.dexterity = randomGenerator.nextInt(11)+1;
    }

    public int getDexterity() {
        return this.dexterity;
    }

     /**
     * open a treasure
     * @param chest treasure
     * @return gold
     */
    @Override
    public void open(Treasure chest) {

        if (chest.getPickResistance() <= this.dexterity) {

            this.setMoney(this.getMoney() + chest.getGold());
            System.out.println(this.getName() + " opens the chest! He now has " + this.getMoney() + " coins.");
        } else {

            System.out.println(this.getName() + " failed. The treasure is magically destroyed!");
        }
    }
}
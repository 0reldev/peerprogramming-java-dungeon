import java.util.Random;

class Treasure {

    private int physicalResistance;
    private int spellResistance;
    private int pickResistance;
    private int gold;

    public Treasure() {

        Random randomGenerator = new Random();
        this.physicalResistance = randomGenerator.nextInt(10);
        this.spellResistance = randomGenerator.nextInt(10);
        this.pickResistance = randomGenerator.nextInt(10);
        this.gold = randomGenerator.nextInt(200);
    }

    public int getPhysicalResistance() {
        return this.physicalResistance;
    }

    public int getSpellResistance() {
        return this.spellResistance;
    }

    public int getPickResistance() {
        return this.pickResistance;
    }

    public int getGold() {
        return this.gold;
    }
}
abstract class Adventurer implements Comparable<Adventurer> {
    
    private int gold;
    private String name;

    public int compareTo(Adventurer other) {
        return this.getMoney() - other.getMoney();
    }

    public Adventurer(String name, int gold) {

        this.name = name;
        this.gold = gold;
    }
    public Adventurer(String name) {

        this.name = name;
        this.gold = 0 ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney( int gold) {
        this.gold = gold;
    }

    public String getName() {
        return this.name;
    }

    public int getMoney() {
        return this.gold;
    }

    public abstract void open(Treasure chest);




    
}
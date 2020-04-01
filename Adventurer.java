abstract class Adventurer implements Comparable<Adventurer> {
    
    private int gold;
    private String name;

    // public abstract  int compareTo(T arg0);
    public int compareTo(Adventurer other) {
        return this.getMoney() - other.getMoney(); // croissant
    }

    // Constructors
    public Adventurer(String name, int gold){
        this.name = name;
        this.gold = gold;
    }
    public Adventurer(String name){
        this.name = name;
        this.gold = 0 ;
    }


    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMoney( int gold) {
        this.gold = gold;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getMoney() {
        return this.gold;
    }
    
    // instance methods 
    public abstract void open(Treasure chest);




    
}
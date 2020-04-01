abstract class Adventurer {
    
    private int gold;
    private String name;

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
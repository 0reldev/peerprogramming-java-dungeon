import java.util.*;

class Dungeon {

    public static void main(String[] args) {
        
        Random randomGenerator = new Random();
        int nbTreasure = randomGenerator.nextInt(20);
        List<Treasure> treasures = new ArrayList<>();
        for (int i = 0; i <= nbTreasure; i++) {

            treasures.add(new Treasure());
        }
        System.out.println("Number of treasures: "+ nbTreasure + "\n");
        Wizard merlin = new Wizard("Merlin");
        System.out.println(merlin.getName() + "'s intelligence: " + merlin.getIntelligence());
        Thief lupin = new Thief("Lupin");
        System.out.println(lupin.getName() + "'s dexterity: " + lupin.getDexterity());
        Warrior gaston = new Warrior("Gaston");
        System.out.println(gaston.getName() + "'s strength: " + gaston.getStrength()+"\n");
        List<Adventurer> adventurers = new ArrayList<>();
        adventurers.add(merlin);
        adventurers.add(lupin);
        adventurers.add(gaston);
        int numList = 0;
        for (Treasure treasure : treasures) {

            adventurers.get(numList).open(treasure);
            numList += 1;
            if (numList == 3) {

                numList = 0;
            }
        }
        System.out.println("");
        Comparator<Adventurer> compareGold = new Comparator<Adventurer>() {
        
            @Override
            public int compare(Adventurer current, Adventurer other) {

                return other.getMoney() - current.getMoney();
            }
        };
        Collections.sort(adventurers, compareGold);
        for (Adventurer adventurer : adventurers) {

            System.out.println("The adventurer " + adventurer.getName() + " has " + adventurer.getMoney() + " coins!!");
        }
    }
}
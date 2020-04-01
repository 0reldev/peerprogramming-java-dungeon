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

        
        // création aventuriers
        Wizard merlin = new Wizard("Merlin");
        System.out.println(merlin.getName() + "'s intelligence: " + merlin.getIntelligence());
        Thief lupin = new Thief("Lupin");
        System.out.println(lupin.getName() + "'s dexterity: " + lupin.getDexterity());
        Warrior gaston = new Warrior("Gaston");
        System.out.println(gaston.getName() + "'s strength: " + gaston.getStrength()+"\n");
        

        List<Adventurer> adventurers = new ArrayList<>();
        // TODO : add new adventurers to the list
        adventurers.add(merlin); // indice 0
        adventurers.add(lupin);
        adventurers.add(gaston);
    

        int numList = 0;
        for (Treasure treasure : treasures) {
            // TODO : the next adventurer opens the treasure
            // pour chaque trésor[i] le faire ouvrir par un aventurier dans l'ordre de passage 0,1,2
                adventurers.get(numList).open(treasure);
                numList += 1;
                if (numList == 3) {
                    numList = 0;
                }
        }

        System.out.println("");
        // TODO : order adventurer by gold descending
        Comparator<Adventurer> compareGold = new Comparator<Adventurer>(){
        
            @Override
            public int compare(Adventurer current, Adventurer other) {
                // if (current.getMoney() < other.getMoney()) {
                //     return 1;
                // }
                // if (current.getMoney() > other.getMoney()) {
                //     return -1;
                // }
                // return 0;
                return other.getMoney() - current.getMoney();
                // négative : current passe avant other
                // zéro : l'ordre ne change pas
                // positif : current passe après other
            }
        };
        Collections.sort(adventurers, compareGold);
        for (Adventurer adventurer : adventurers) {
            // TODO : show adventurer gold
            System.out.println("The adventurer " + adventurer.getName() + " has " + adventurer.getMoney() + " coins!!");

        }
        // Collections.sort(adventurers);
        // for (Adventurer adventurer : adventurers) {
        //     // TODO : show adventurer gold
        //     System.out.println("The adventurer " + adventurer.getName() + " has " + adventurer.getMoney() + " coins!!");

        // }
    }
}
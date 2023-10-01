package lotr;

import lotr.lotr.Character;

public class GameManager {
    public static void fight(Character character1, Character character2) {
        int round = 1;
        System.out.println(String.format("\nChacter1: %s\nChacter2: %s",
                                         character1.toString(), character2.toString()));

        // FIGHTING
        System.out.println("\n************* FIGHTING *************");

        // Hobbit cannot defeat another Hobbit
        if (character1 instanceof Hobbit && character2 instanceof Hobbit) {
            System.out.println("Both Hobbits are crying...");
            return;
        }

        while (character1.isAlive() && character2.isAlive()) {
            if (round % 2 == 1) {
                GameManager.round(character1, character2, round);
            } else {
                GameManager.round(character2, character1, round);
            }
            ++round;
        }

        // RESULTS
        System.out.println("\n************* RESULTS *************");
        System.out.println((character1.isAlive()) ? "Character1: " + 
                            character1.getClass().getSimpleName() + " wins!!" :
                            "Character2: " + character2.getClass().getSimpleName() + " wins!!");
    }

    public static void round(Character character1, Character character2, int round) {        
        System.out.println("\n----------------- ROUND " + round + " -----------------");
        System.out.println(character1.toString() + " kicks " + character2.toString());
        System.out.println(character1.getKick().strategy());
        System.out.println("------------------------------------------------");
        character1.kick(character2);

        System.out.println("");
        System.out.print(character1.toString());
        System.out.println(" | " + character2.toString());
        System.out.println("");
    }
}

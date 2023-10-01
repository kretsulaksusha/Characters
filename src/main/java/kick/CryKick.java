package kick;

import lotr.lotr.Character;

public class CryKick implements KickStrategy {
    @Override
    public void kick(Character character, Character opponent) {
        System.out.println(character.getClass().getSimpleName() + " is crying...");
    }

    @Override
    public String strategy() {
        return "Strategy: just crying((";
    }
}

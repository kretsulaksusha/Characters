package kick;

import lotr.lotr.Character;

public class NobleKick implements KickStrategy{
    @Override
    public void kick(Character character, Character opponent) {
        opponent.setHp(character.getHp() - Character.getRandomNumBetween(5, 15));
    }

    @Override
    public String strategy() {
        return "Strategy: decrease number of hp of the opponent by random number which will be in the range of his power.";
    }
}

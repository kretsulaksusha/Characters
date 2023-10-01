package kick;

import lotr.lotr.Character;

public class EKick implements KickStrategy{

    @Override
    public void kick(Character character, Character opponent) {
        if (opponent.getPower() < character.getPower()) {
            opponent.setHp(0);
        } else {
            character.setPower(character.getPower() - 1);
        }
    }

    @Override
    public String strategy() {
        return "Strategy: kills everybody weaker than him, otherwise decrease the power of opponent by 1.";
    }
}

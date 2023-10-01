package kick;

import lotr.lotr.Character;

public interface KickStrategy {
    void kick(Character character, Character opponent);

    String strategy();
}

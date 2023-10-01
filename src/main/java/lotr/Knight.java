package lotr;

import lotr.lotr.Character;
import kick.NobleKick;

public class Knight extends Character{
    public Knight() {
        super(getRandomNumBetween(2, 12),
              getRandomNumBetween(2, 12),
              new NobleKick());
    }
}

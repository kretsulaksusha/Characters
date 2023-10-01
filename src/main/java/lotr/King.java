package lotr;

import lotr.lotr.Character;
import kick.NobleKick;

public class King extends Character{
    public King() {
        super(getRandomNumBetween(5, 15),
              getRandomNumBetween(5, 15),
              new NobleKick());
    }
}

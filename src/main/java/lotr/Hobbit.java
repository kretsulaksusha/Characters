package lotr;

import lotr.lotr.Character;
import kick.CryKick;

public class Hobbit extends Character{
    public Hobbit() {
        super(0, 3, new CryKick());
    }
}

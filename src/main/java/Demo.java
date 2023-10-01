import lotr.CharacterFactory;
import lotr.GameManager;
import lotr.lotr.Character;

public class Demo {
    public static void main(String[] args) {
        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();
        GameManager.fight(character1, character2);
    }
}

package lotr;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import lotr.lotr.Character;

import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Random random = new Random();
        List<Class<? extends lotr.lotr.Character>> characters = Arrays.asList(
            Hobbit.class, Elf.class, King.class, Knight.class);
        return characters.get(random.nextInt(characters.size())).newInstance();
    }
}

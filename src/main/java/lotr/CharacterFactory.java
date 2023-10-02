package lotr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

import lotr.lotr.Character;

import lombok.SneakyThrows;

public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Random random = new Random();

        // reflecting a src/main/java/lotr package
        Reflections reflections = new Reflections("lotr");

        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> characters = new ArrayList<>(subTypes);
        return characters.get(random.nextInt(characters.size())).getDeclaredConstructor().newInstance();
    }
}

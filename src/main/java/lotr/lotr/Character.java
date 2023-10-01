package lotr.lotr;
import java.util.Random;

import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Character {
    @Setter @Getter
    private int power;
    @Getter
    private int hp;
    @Getter
    private KickStrategy kick;

    public void kick(Character opponent) {
        kick.kick(this, opponent);
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = (hp < 0) ? 0 : hp;
    }

    public String toString() {
        return String.format("%s{hp=%d, power=%d}",
                             this.getClass().getSimpleName(),
                             this.hp, this.power);
    }

    public static int getRandomNumBetween(int lowerBound, int upperBound) {
        // Generate number between lowerBound and upperBound inclusively
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}

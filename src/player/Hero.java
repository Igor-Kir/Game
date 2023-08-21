package player;
import opportunities.FantasyCharacter;

public class Hero extends FantasyCharacter {


    public Hero(String name, int healthPoints, int gold, int strength, int dexterity, int xp) {
        super(name, healthPoints, gold, strength, dexterity, xp);
    }

    @Override
    public int attack() {
        return super.attack();
    }
}

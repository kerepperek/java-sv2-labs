package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character {

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    private int getActualSecondaryDamage() {
        return (int)(2*Math.random() * getActualPrimaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if (getPosition().getDistance(enemy.getPosition()) < 2) {
            hit(enemy, getActualSecondaryDamage());
        }
    }
}

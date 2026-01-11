package headfirst.designpatterns.strategy.actionadventuregame.character;

import headfirst.designpatterns.strategy.actionadventuregame.weapon.BowAndArrowBehavior;

public class Queen extends Character {

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}

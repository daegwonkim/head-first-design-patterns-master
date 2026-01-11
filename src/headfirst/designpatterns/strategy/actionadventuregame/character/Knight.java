package headfirst.designpatterns.strategy.actionadventuregame.character;

import headfirst.designpatterns.strategy.actionadventuregame.weapon.KnifeBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}

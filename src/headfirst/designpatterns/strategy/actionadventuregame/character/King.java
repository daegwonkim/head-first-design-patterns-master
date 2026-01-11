package headfirst.designpatterns.strategy.actionadventuregame.character;

import headfirst.designpatterns.strategy.actionadventuregame.weapon.SwordBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}

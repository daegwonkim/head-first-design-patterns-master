package headfirst.designpatterns.strategy.actionadventuregame.character;

import headfirst.designpatterns.strategy.actionadventuregame.weapon.AxeBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.useWeapon();
    }
}

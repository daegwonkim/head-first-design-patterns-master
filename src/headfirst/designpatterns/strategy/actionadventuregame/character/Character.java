package headfirst.designpatterns.strategy.actionadventuregame.character;

import headfirst.designpatterns.strategy.actionadventuregame.weapon.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}

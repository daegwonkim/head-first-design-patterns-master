package headfirst.designpatterns.strategy.actionadventuregame;

import headfirst.designpatterns.strategy.actionadventuregame.character.Character;
import headfirst.designpatterns.strategy.actionadventuregame.character.King;
import headfirst.designpatterns.strategy.actionadventuregame.character.Queen;
import headfirst.designpatterns.strategy.actionadventuregame.weapon.KnifeBehavior;

public class ActionAdventureGameSimulator {

    public static void main(String[] args) {
        Character king = new King();
        king.fight();

        Character queen = new Queen();
        queen.fight();
        queen.setWeaponBehavior(new KnifeBehavior());
        queen.fight();
    }
}

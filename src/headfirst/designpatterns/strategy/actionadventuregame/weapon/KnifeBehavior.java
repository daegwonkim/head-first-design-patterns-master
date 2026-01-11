package headfirst.designpatterns.strategy.actionadventuregame.weapon;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("칼로 벱니다");
    }
}

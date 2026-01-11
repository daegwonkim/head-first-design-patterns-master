package headfirst.designpatterns.strategy.actionadventuregame.weapon;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("도끼로 찍습니다");
    }
}

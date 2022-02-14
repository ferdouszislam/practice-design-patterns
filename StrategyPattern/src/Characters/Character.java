package Characters;
import Weapons.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weaponBehavior;

    public void fight() {

        try{
            weaponBehavior.useWeapon();
        }
        catch (NullPointerException exception){

            System.out.println("attack failed! character has no weapon.");
        }
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}

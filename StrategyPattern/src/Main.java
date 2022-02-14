import Characters.Character;
import Characters.Troll;
import Weapons.AxeBehavior;

public class Main {

    public static void main(String[] args) {

        Character character = new Troll();

        // attack without any weapon behavior
        character.fight();

        // set weapon behavior dynamically
        character.setWeaponBehavior(new AxeBehavior());
        character.fight();

    }
}

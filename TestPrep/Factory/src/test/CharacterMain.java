package test;

import clase.character.CharacterFactory;
import clase.character.IGameCharacter;
import clase.vehicle.IVehicle;

public class CharacterMain {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        IGameCharacter character = null;

        try {
            character = factory.getCharacter("warrior");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        character.attack();

        try {
            character = factory.getCharacter("archer");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        character.attack();
    }
}

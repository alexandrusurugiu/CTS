package clase.character;

public class CharacterFactory {
    public IGameCharacter getCharacter(String character) {
        return switch (character) {
            case "warrior" -> new Warrior();
            case "archer" -> new Archer();
            default -> throw new RuntimeException("Invalid character: " + character);
        };
    }
}

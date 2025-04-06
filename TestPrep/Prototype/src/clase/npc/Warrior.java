package clase.npc;

public class Warrior extends Npc {
    @Override
    public void getDialog() {
        System.out.println("This is Sparta!");
    }

    public Warrior() {
        this.damage = 100;
        this.role = "warrior";
        this.health = 100;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "role='" + role + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}

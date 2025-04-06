package clase.npc;

public class Merchant extends Npc {
    @Override
    public void getDialog() {
        System.out.println("Hi, what do you want to buy?");
    }

    public Merchant() {
        this.health = 69;
        this.damage = 69;
        this.role = "merchant";
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "role='" + role + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}

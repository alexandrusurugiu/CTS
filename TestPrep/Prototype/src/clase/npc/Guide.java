package clase.npc;

public class Guide extends Npc {
    @Override
    public void getDialog() {
        System.out.println("Hi, how can I help you?");
    }

    public Guide() {
        this.health = 100;
        this.damage = 20;
        this.role = "guide";
    }

    @Override
    public String toString() {
        return "Guide{" +
                "role='" + role + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}

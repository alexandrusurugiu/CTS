package clase.npc;

public abstract class Npc implements Cloneable {
    protected String role;
    protected float health;
    protected int damage;

    public String getRole() {
        return role;
    }

    public float getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public abstract void getDialog();

    @Override
    protected Npc clone() throws CloneNotSupportedException {
        return (Npc) super.clone();
    }
}

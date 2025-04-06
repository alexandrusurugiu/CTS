package test;

import clase.npc.Npc;
import clase.npc.NpcFactory;
import clase.npc.Warrior;

public class NpcMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Npc merchant = NpcFactory.getNpc("merchant");
        Npc guide = NpcFactory.getNpc("guide");

        merchant.getDialog();
        guide.getDialog();

        System.out.println(merchant);
        System.out.println(guide);

        //crapa
        NpcFactory.addPrototype(null, new Warrior());
        Npc warrior = NpcFactory.getNpc("warrior");
        warrior.getDialog();
        System.out.println(warrior);
    }
}

package test;

import clase.pc.Computer;
import clase.pc.ComputerBuilder;

public class ComputerMain {
    public static void main(String[] args) {
        Computer c1 = new ComputerBuilder("AMD Ryzen 5 9600x", 32, "Asus B650M PLUS").addFan("Lian Li Red 140").addFan("Corsair Pink 140").build();
        Computer c2 = new ComputerBuilder("Intel Ultra 7 260k", 64, "Gigabyte Aorus 870 PCIe 4").addGpu("AMD Radeon 9700XT").build();

        System.out.println(c1);
        System.out.println(c2);
    }
}

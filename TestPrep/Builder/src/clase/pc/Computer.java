package clase.pc;

import java.util.List;

public class Computer {
    private final String cpu;
    private final int ram;
    private final String motherboard;
    private final String gpu;
    private final String primarySSD;
    private final String secondarySSD;
    private final String networkCard;
    private final List<String> fans;

    Computer(String cpu, int ram, String motherboard, String gpu, String primarySSD, String secondarySSD, String networkCard, List<String> fans) {
        this.cpu = cpu;
        this.ram = ram;
        this.motherboard = motherboard;
        this.gpu = gpu;
        this.primarySSD = primarySSD;
        this.secondarySSD = secondarySSD;
        this.networkCard = networkCard;
        this.fans = fans;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", motherboard='" + motherboard + '\'' +
                ", gpu='" + gpu + '\'' +
                ", primarySSD='" + primarySSD + '\'' +
                ", secondarySSD='" + secondarySSD + '\'' +
                ", networkCard='" + networkCard + '\'' +
                ", fans=" + fans +
                '}';
    }
}

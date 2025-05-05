package clase.pc;

import java.util.ArrayList;
import java.util.List;

public class ComputerBuilder implements IBuilder {
    private String cpu;
    private int ram;
    private String motherboard;
    private String gpu;
    private String primarySSD;
    private String secondarySSD;
    private String networkCard;
    private List<String> fans;

    public String getCpu() {
        return cpu;
    }

    public int getRam() {
        return ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getGpu() {
        return gpu;
    }

    public String getPrimarySSD() {
        return primarySSD;
    }

    public String getSecondarySSD() {
        return secondarySSD;
    }

    public String getNetworkCard() {
        return networkCard;
    }

    public ComputerBuilder(String cpu, int ram, String motherboard) {
        this.cpu = cpu;
        this.ram = ram;
        this.motherboard = motherboard;
        this.gpu = null;
        this.primarySSD = null;
        this.secondarySSD = null;
        this.networkCard = null;
        this.fans = new ArrayList<>();
    }

    public ComputerBuilder addRam(int ram) {
        if (ram < 4) {
            throw new RuntimeException("Ram should be at least 4 GB!");
        }

        this.ram = ram;
        return this;
    }

    public ComputerBuilder addGpu(String gpu) {
        if (!motherboard.contains("PCIe 4")) {
            throw new RuntimeException("Motherboard should contain PCIe 4!");
        }

        this.gpu = gpu;
        return this;
    }

    public ComputerBuilder addFan(String fan) {
        this.fans.add(fan);
        return this;
    }

    public ComputerBuilder addPrimarySSD(String primarySSD) {
        this.primarySSD = primarySSD;
        return this;
    }

    public ComputerBuilder addSecondarySSD(String secondarySSD) {
        if (primarySSD == null) {
            throw new RuntimeException("You have to add the primary SSD first!");
        }

        this.secondarySSD = secondarySSD;
        return this;
    }

    public ComputerBuilder addNetworkCard(String networkCard) {
        this.networkCard = networkCard;
        return this;
    }

    @Override
    public Computer build() {
        if (cpu == null && motherboard == null) {
            throw new RuntimeException("You have to add the CPU and Motherboard first!");
        }

        return new Computer(cpu, ram, motherboard, gpu, primarySSD, secondarySSD, networkCard, fans);
    }
}

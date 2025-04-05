package clase.home;

import java.util.List;

public class SmartHomeSystem {
    private final String controller;
    private final String networkType;
    private final int numberOfLights;
    private final int thermostat;
    private final List<String> securityCameras;
    private final String voiceAssistant;

    SmartHomeSystem(String controller, String networkType, int lightingSystem, int thermostat, List<String> securityCameras, String voiceAssistant) {
        this.controller = controller;
        this.networkType = networkType;
        this.numberOfLights = lightingSystem;
        this.thermostat = thermostat;
        this.securityCameras = securityCameras;
        this.voiceAssistant = voiceAssistant;
    }

    @Override
    public String toString() {
        return "SmartHomeSystem{" +
                "controller='" + controller + '\'' +
                ", networkType='" + networkType + '\'' +
                ", numberOfLights=" + numberOfLights +
                ", thermostat=" + thermostat +
                ", securityCameras=" + securityCameras +
                ", voiceAssistant='" + voiceAssistant + '\'' +
                '}';
    }
}

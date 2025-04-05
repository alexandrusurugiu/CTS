package clase.home;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeSystemBuilder implements IBuilder {
    private String controller;
    private String networkType;
    private int numberOfLights;
    private int thermostat;
    private List<String> securityCameras;
    private String voiceAssistant;

    public SmartHomeSystemBuilder setThermostat(int thermostat) {
        if (thermostat < 10 || thermostat > 30) {
            throw new RuntimeException("The temperature from the thermostat must be between 10 and 30");
        }

        this.thermostat = thermostat;
        return this;
    }

    public SmartHomeSystemBuilder setNumberOfLights(int numberOfLights) {
        if (numberOfLights < 0) {
            throw new RuntimeException("The number of lights must be a positive value!");
        }

        this.numberOfLights = numberOfLights;
        return this;
    }

    public SmartHomeSystemBuilder addSecurityCamera(String securityCamera) {
        if (securityCameras == null) {
            throw new RuntimeException("You have to add a security camera!");
        }

        this.securityCameras.add(securityCamera);
        return this;
    }

    public SmartHomeSystemBuilder setVoiceAssistant(String voiceAssistant) {
        if (!voiceAssistant.equals("Alexa") && controller.equals("Amazon Echo")) {
            throw new RuntimeException("If you have Amazon Echo, you can only add Alexa as a voice assistant!");
        } else if (!voiceAssistant.equals("Google") && controller.equals("Google Nest")) {
            throw new RuntimeException("If you have Google Nest, you can only add Google as a voice assistant!");
        }

        this.voiceAssistant = voiceAssistant;
        return this;
    }

    public SmartHomeSystemBuilder(String controller, String networkType) {
        this.controller = controller;
        this.networkType = networkType;
        this.securityCameras = new ArrayList<String>();
        this.voiceAssistant = null;
        this.thermostat = 0;
        this.numberOfLights = 0;
    }

    @Override
    public SmartHomeSystem build() {
        return new SmartHomeSystem(controller, networkType, numberOfLights, thermostat, securityCameras, voiceAssistant);
    }
}

package test;

import clase.home.SmartHomeSystem;
import clase.home.SmartHomeSystemBuilder;

public class SmartHomeSystemMain {
    public static void main(String[] args) {
        SmartHomeSystem hs1 = new SmartHomeSystemBuilder("Amazon Echo", "Zigbee").setVoiceAssistant("Alexa").setNumberOfLights(4).setThermostat(26).addSecurityCamera("Nikon").build();
        SmartHomeSystem hs2 = new SmartHomeSystemBuilder("Google Nest", "Wifi 6").setVoiceAssistant("Google").addSecurityCamera("Sony").setThermostat(15).build();

        //aici crapa
        SmartHomeSystem hs3 = new SmartHomeSystemBuilder("Google Nest", "Wifi 6").setVoiceAssistant("Bixby").addSecurityCamera("Cannon").setThermostat(11).build();
        SmartHomeSystem hs4 = new SmartHomeSystemBuilder("Google Nest", "Wifi 6").setVoiceAssistant("Google").addSecurityCamera("FujiFilm").setThermostat(-1).build();

        System.out.println(hs1);
        System.out.println(hs2);
    }
}

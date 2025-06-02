package api.program;

import api.clase.APIProxy;
import api.clase.Api;

public class Main {
    public static void main(String[] args) {
        APIProxy proxy = new APIProxy();
        for (int i=0; i<105; i++) {
            try {
                System.out.println(proxy.obtineDate("Lorem ipsum"));
            } catch (RuntimeException ex) {
                ex.printStackTrace();
            }
        }
    }
}

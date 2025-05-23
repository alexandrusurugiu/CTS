package directors.clase;

public interface ManagerHandler {
    void setNextHandler(ManagerHandler nextManagerHandler);
    void handleRequest(Request request);
}

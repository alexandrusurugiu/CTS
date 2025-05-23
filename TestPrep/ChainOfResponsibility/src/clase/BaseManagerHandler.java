package clase;

public abstract class BaseManagerHandler implements ManagerHandler {
    private ManagerHandler managerHandler;

    @Override
    public void setNextHandler(ManagerHandler nextManagerHandler) {
        managerHandler = nextManagerHandler;
    }

    public void passToNextDirector(Request request){
        if (managerHandler != null) {
            managerHandler.handleRequest(request);
        } else {
            System.out.println("No more directors left!");
        }
    }
}

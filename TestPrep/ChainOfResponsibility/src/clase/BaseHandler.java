package clase;

public abstract class BaseHandler implements Handler {
    private Handler handler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        handler = nextHandler;
    }

    public void passToNextDirector(Request request){
        if (handler != null) {
            handler.handleRequest(request);
        } else {
            System.out.println("No more directors left!");
        }
    }
}

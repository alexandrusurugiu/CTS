package clase;

public class DirectorHandler extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("The director has approved the request " + request.getName() + " for " + request.getAmount() + " euros!");
    }
}

package directors.clase;

public class DirectorManagerHandler extends BaseManagerHandler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("The director has approved the request " + request.getName() + " for " + request.getAmount() + " euros!");
    }
}

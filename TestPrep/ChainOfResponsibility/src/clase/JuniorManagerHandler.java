package clase;

public class JuniorManagerHandler extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getAmount() <= 1000) {
            System.out.println("\nThe junior manager has approved the request of " + request.getName() + " for " + request.getAmount() + " euros!");
        } else {
            System.out.println("\nThe junior manager cannot approve the request! Passing it to the next manager...");
            passToNextDirector(request);
        }
    }
}

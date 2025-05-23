package clase;

public class SeniorManagerHandler extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getAmount() <= 7500) {
            System.out.println("The senior manager has approved the request of " + request.getName() + " for " + request.getAmount() + " euros!");
        } else {
            System.out.println("The senior manager cannot approve the request! Passing it to the next manager...");
            passToNextDirector(request);
        }
    }
}

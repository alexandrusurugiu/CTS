package clase;

public class Bank {
    BaseHandler juniorManagerHandler;
    BaseHandler seniorManagerHandler;
    BaseHandler directorHandler;

    public Bank(BaseHandler juniorManagerHandler, BaseHandler seniorManagerHandler, BaseHandler directorHandler) {
        this.juniorManagerHandler = juniorManagerHandler;
        this.seniorManagerHandler = seniorManagerHandler;
        this.directorHandler = directorHandler;

        this.juniorManagerHandler.setNextHandler(seniorManagerHandler);
        this.seniorManagerHandler.setNextHandler(directorHandler);
    }

    public void processRequest(Request request) {
        this.juniorManagerHandler.handleRequest(request);
    }
}

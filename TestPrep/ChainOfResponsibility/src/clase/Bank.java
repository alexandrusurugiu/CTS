package clase;

public class Bank {
    BaseManagerHandler juniorManagerHandler;
    BaseManagerHandler seniorManagerHandler;
    BaseManagerHandler directorHandler;

    public Bank(BaseManagerHandler juniorManagerHandler, BaseManagerHandler seniorManagerHandler, BaseManagerHandler directorHandler) {
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

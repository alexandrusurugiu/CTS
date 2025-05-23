package tickets.clase;

public abstract class BaseTicketHandler implements TicketHandler {
    protected int priority;
    private TicketHandler nextHandler;

    BaseTicketHandler(int priority) {
        this.priority = priority;
    }

    @Override
    public void setNextHandler(TicketHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void passToNextSupport(SupportTicket ticket) {
        if (nextHandler != null) {
            nextHandler.processHandler(ticket);
        } else {
            System.out.println("There are no more levels of support to go through");
        }
    }
}

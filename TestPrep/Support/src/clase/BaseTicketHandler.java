package clase;

public abstract class BaseTicketHandler implements TicketHandler {
    private TicketHandler ticket;

    @Override
    public void setNextHandler(TicketHandler nextTicket) {
        this.ticket = nextTicket;
    }

    p
}

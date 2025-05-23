package tickets.clase;

public interface TicketHandler {
    void setNextHandler(TicketHandler nextHandler);
    void processHandler(SupportTicket ticket);
}

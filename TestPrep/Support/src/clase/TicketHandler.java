package clase;

public interface TicketHandler {
    void setNextHandler(TicketHandler handler);
    void processHandler(SupportTicket ticket);
}

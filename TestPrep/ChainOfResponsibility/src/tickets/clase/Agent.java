package tickets.clase;

public class Agent {
    private BaseTicketHandler support1;
    private BaseTicketHandler support2;
    private BaseTicketHandler support3;

    public Agent(BaseTicketHandler support1, BaseTicketHandler support2, BaseTicketHandler support3) {
        this.support1 = support1;
        this.support2 = support2;
        this.support3 = support3;

        this.support1.setNextHandler(support2);
        this.support2.setNextHandler(support3);
    }

    public void processTicket(SupportTicket ticket) {
        this.support1.processHandler(ticket);
    }
}

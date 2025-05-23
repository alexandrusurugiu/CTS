package tickets.program;

import tickets.clase.*;

public class Main {
    public static void main(String[] args) {
        BaseTicketHandler support = new Level1SupportHandler();
        BaseTicketHandler support2 = new Level2SupportHandler();
        BaseTicketHandler support3 = new Level3SupportHandler();

        Agent agent = new Agent(support, support2, support3);

        SupportTicket ticket = new SupportTicket("Connectivity issue", 1);
        SupportTicket ticket2 = new SupportTicket("Server error", 3);
        SupportTicket ticket3 = new SupportTicket("Critical bug in production", 5);

        agent.processTicket(ticket);
        agent.processTicket(ticket2);
        agent.processTicket(ticket3);
    }
}

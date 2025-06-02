package tickets.clase;

public class Level1SupportHandler extends BaseTicketHandler {
    public Level1SupportHandler() {
        super(1);
    }

    @Override
    public void processHandler(SupportTicket ticket) {
        if (ticket.getPriorityLevel() > priority) {
            System.out.println("\nLevel 1 support couldn't solve the issue. Sending it to next level support...");
            passToNextSupport(ticket);
        } else {
            System.out.println("Level 1 support solved the issue!");
        }
    }
}

package tickets.clase;

public class Level2SupportHandler extends BaseTicketHandler{
    public Level2SupportHandler() {
        super(3);
    }

    @Override
    public void processHandler(SupportTicket ticket) {
        if (ticket.getPriorityLevel() > 3) {
            System.out.println("Level 2 support couldn't solve the issue! Sending it to next level support...");
            passToNextSupport(ticket);
        } else {
            System.out.println("Level 2 support solved the issue!");
        }
    }
}

package tickets.clase;

public class Level3SupportHandler extends BaseTicketHandler {
    public Level3SupportHandler() {
        super(5);
    }

    @Override
    public void processHandler(SupportTicket ticket) {
        System.out.println("The issue has been solved!");
    }
}

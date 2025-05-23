package tickets.clase;

public class SupportTicket {
    private String description;
    private int priorityLevel;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public SupportTicket(String description, int priorityLevel) {
        this.description = description;
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String toString() {
        return "SupportTicket{" +
                "description='" + description + '\'' +
                ", priorityLevel=" + priorityLevel +
                '}';
    }
}

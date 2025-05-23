package clase;

public class SupportTicket {
    private String description;
    private int severity;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public SupportTicket(String description, int severity) {
        this.description = description;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "SupportTicket{" +
                "description='" + description + '\'' +
                ", severity=" + severity +
                '}';
    }
}

package logger.clase;

public class InfoLoggerHandler extends BaseLogHandler {

    @Override
    public void handleLogMessage(LogMessage logMessage) {
        if (logMessage.getSeverity() == Severity.INFO) {
            System.out.println("\nInfo log: " + logMessage.getMessage());
        } else {
            System.out.println("\nCouldn't get info log. Passing to the next step...");
            passToNext(logMessage);
        }
    }
}

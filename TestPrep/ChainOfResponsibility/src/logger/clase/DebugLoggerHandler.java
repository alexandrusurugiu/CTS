package logger.clase;

public class DebugLoggerHandler extends BaseLogHandler {
    @Override
    public void handleLogMessage(LogMessage logMessage) {
        if (logMessage.getSeverity() == Severity.DEBUG) {
            System.out.println("Debug log: " + logMessage.getMessage());
        } else {
            System.out.println("Couldn't get debug log. Passing to the next step...");
            passToNext(logMessage);
        }
    }
}

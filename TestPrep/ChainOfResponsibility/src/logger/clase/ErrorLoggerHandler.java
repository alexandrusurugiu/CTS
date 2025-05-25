package logger.clase;

public class ErrorLoggerHandler extends BaseLogHandler {
    @Override
    public void handleLogMessage(LogMessage logMessage) {
        System.out.println("Erorr log: " + logMessage.getMessage());
    }
}

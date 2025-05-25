package logger.clase;

public interface LogHandler {
    void setNextHandler(LogHandler nextHandler);
    void handleLogMessage(LogMessage logMessage);
}

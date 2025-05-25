package logger.clase;

public abstract class BaseLogHandler implements LogHandler {
    private LogHandler nextHandler;

    @Override
    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void passToNext(LogMessage logMessage){
        if (nextHandler != null) {
            nextHandler.handleLogMessage(logMessage);
        } else {
            System.out.println("No more loggers left!");
        }
    }
}

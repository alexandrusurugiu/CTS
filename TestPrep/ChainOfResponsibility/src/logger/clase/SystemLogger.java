package logger.clase;

public class SystemLogger {
    private BaseLogHandler infoLog;
    private BaseLogHandler debugLog;
    private BaseLogHandler errorLog;

    public SystemLogger(BaseLogHandler infoLog, BaseLogHandler debugLog, BaseLogHandler errorLog) {
        this.infoLog = infoLog;
        this.debugLog = debugLog;
        this.errorLog = errorLog;

        this.infoLog.setNextHandler(debugLog);
        this.debugLog.setNextHandler(errorLog);
    }

    public void beginDiagnostic(LogMessage logMessage) {
        infoLog.handleLogMessage(logMessage);
    }
}

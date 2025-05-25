package logger.program;

import logger.clase.*;
import logger.clase.SystemLogger;

public class Main {
    public static void main(String[] args) {
        BaseLogHandler infoHandler = new InfoLoggerHandler();
        BaseLogHandler debugHandler = new DebugLoggerHandler();
        BaseLogHandler errorHandler = new ErrorLoggerHandler();

        SystemLogger systemLogger = new SystemLogger(infoHandler, debugHandler, errorHandler);

        LogMessage infoMessage = new LogMessage("The aplication has started", Severity.INFO);
        LogMessage debugMessage = new LogMessage("Debugging problem...", Severity.DEBUG);
        LogMessage errorMessage = new LogMessage("Fatal error!", Severity.ERROR);

        systemLogger.beginDiagnostic(infoMessage);
        systemLogger.beginDiagnostic(debugMessage);
        systemLogger.beginDiagnostic(errorMessage);
    }
}

package adapterPattern.logger;

public interface LoggerAdapter {
    void logInfo(String message);
    void logError(String message);
    void logDebug(String message); 
}

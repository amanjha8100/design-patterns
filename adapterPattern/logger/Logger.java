package adapterPattern.logger;

public class Logger {
    public static void main(String args[]) {
        LoggerAdapterImpl ob = new LoggerAdapterImpl();
        ob.logInfo("Info Log");
        ob.logError("Error Log");
        ob.logDebug("Debug Log");
    }
}

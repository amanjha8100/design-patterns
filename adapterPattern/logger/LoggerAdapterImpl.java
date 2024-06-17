package adapterPattern.logger;

public class LoggerAdapterImpl implements LoggerAdapter {
    public LoggerAdapterImpl() {}

    @Override
    public void logInfo(String mess) {
        System.out.println("Info " + LoggerAdapterImpl.class.getName() + ":: " + mess );
    }

    @Override
    public void logError(String mess) {
        System.out.println(("Error " + LoggerAdapterImpl.class.getName() + ":: " + mess));
    }

    @Override
    public void logDebug(String mess) {
        System.out.println(("Debug " + LoggerAdapterImpl.class.getName() + ":: " + mess));
    }
}
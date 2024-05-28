public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = LoggerFactory.onConsole();
        Logger fileLogger = LoggerFactory.onFile();

        consoleLogger.log(Level.DEBUG, "Erro");
        consoleLogger.log(Level.WARNING, "Erro");
        consoleLogger.log(Level.ERROR, "Erro");

        fileLogger.log(Level.DEBUG, "Erro");
        fileLogger.log(Level.WARNING, "Erro");
        fileLogger.log(Level.ERROR, "Erro");
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFile implements Logger {
    private static final String FILE_PATH = "log.txt";

    @Override
    public void log(Level level, String message) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " [" + level + "] " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

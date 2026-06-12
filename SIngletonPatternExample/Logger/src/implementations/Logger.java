package implementations;

public class Logger {

    static final Logger obj = new Logger();

    private Logger() {};

    public static Logger getInstance() {
        return obj;
    }

}

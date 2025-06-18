package SingletonPackage;

public class Logger {
	private static Logger Logger_Instance = null;
	private Logger() {}
	public static Logger getInstance() {
		if(Logger_Instance == null)
			Logger_Instance = new Logger();
		return Logger_Instance;
	}
}


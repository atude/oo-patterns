package SingletonPattern;

public class Logger {
	private static Logger thisInstance = null;

	private Logger() {}

	public static Logger getInstance() {
		if (thisInstance == null)
			thisInstance = new Logger();

		return thisInstance;
	}

	public void log(String s) {
		System.err.println(s);
	}
}
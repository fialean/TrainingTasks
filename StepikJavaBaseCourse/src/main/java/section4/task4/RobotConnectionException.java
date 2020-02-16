package section4.task4;

/**
 * @author Alexandr_Firsin
 * @since 2019.05.24
 */
public class RobotConnectionException extends RuntimeException {
	public RobotConnectionException(String message) {
		super(message);
	}

	public RobotConnectionException(String message, Throwable cause) {
		super(message, cause);
	}
}

package section4.task4;

/**
 * @author Alexandr_Firsin
 * @since 2019.05.24
 */
public interface RobotConnectionManager {
	RobotConnection getConnection() throws RobotConnectionException;
}

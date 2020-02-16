package section4.task4;

/**
 * @author Alexandr_Firsin
 * @since 2019.05.30
 */
public class RobotConnectionManagerImpl1 implements RobotConnectionManager {
	@Override
	public RobotConnection getConnection() throws RobotConnectionException {
		return new RobotConnectionErrorInClose();
	}
}
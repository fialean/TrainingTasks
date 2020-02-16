package section4.task4;

/**
 * @author Alexandr_Firsin
 * @since 2019.05.30
 */
public class RobotConnectionErrorInCloseAndMove implements RobotConnection {
	@Override
	public void moveRobotTo(int x, int y) {
		throw new RobotConnectionException("Ошибка при движении");
	}

	@Override
	public void close() {
		throw new RobotConnectionException("Ошибка при закрытии");
	}
}

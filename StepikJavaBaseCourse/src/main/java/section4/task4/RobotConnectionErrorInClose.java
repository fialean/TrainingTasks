package section4.task4;

/**
 * @author Alexandr_Firsin
 * @since 2019.05.30
 */
public class RobotConnectionErrorInClose implements RobotConnection {
	@Override
	public void moveRobotTo(int x, int y) {

	}

	@Override
	public void close() {
		throw new RobotConnectionException("Ошибка при закрытии");
	}
}

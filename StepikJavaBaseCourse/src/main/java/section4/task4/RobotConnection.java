package section4.task4;

/**
 * @author Alexandr_Firsin
 * @since 2019.05.24
 */
public interface RobotConnection extends AutoCloseable{
	void moveRobotTo(int x, int y);
	@Override
	void close();
}

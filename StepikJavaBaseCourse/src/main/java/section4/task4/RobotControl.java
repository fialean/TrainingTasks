package section4.task4;

/**
 * @author Alexandr_Firsin
 * @since 2019.05.24
 */
public class RobotControl {
	public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
		boolean isConnect = false;
		int rce_count = 0;
		int errorCount = 3;
		for (int i = 1; i < errorCount; i++) {
			try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
				robotConnection.moveRobotTo(toX, toY);
				isConnect = true;
				return;
			} catch (RobotConnectionException rc_ex) {
				if (isConnect) {
					return;
				}
				rce_count++;
				if (i == errorCount) {
					throw rc_ex;
				}
			} catch (Exception ex){
				throw ex;
			}

		}
	}
}

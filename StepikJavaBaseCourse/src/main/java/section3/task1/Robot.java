package section3.task1;

/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
 * <p>
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз,
 * направо или налево.
 * <p>
 * Ваша задача — привести робота в заданную точку игрового поля.
 * <p>
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):*
 * public class Robot {
 * <p>
 * public Direction getDirection() {
 * // текущее направление взгляда
 * }
 * <p>
 * public int getX() {
 * // текущая координата X
 * }
 * <p>
 * public int getY() {
 * // текущая координата Y
 * }
 * <p>
 * public void turnLeft() {
 * // повернуться на 90 градусов против часовой стрелки
 * }
 * <p>
 * public void turnRight() {
 * // повернуться на 90 градусов по часовой стрелке
 * }
 * public void stepForward() {
 * // шаг в направлении взгляда
 * // за один шаг робот изменяет одну свою координату на единицу
 * }
 * }
 * <p>
 * Direction, направление взгляда робота,  — это перечисление:
 * <p>
 * public enum Direction {
 * UP,
 * DOWN,
 * LEFT,
 * RIGHT
 * }
 * <p>
 * Как это  выглядит:
 * смотри картинку
 * <p>
 * Пример
 * <p>
 * В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0,
 * robot.getDirection() == Direction.UP
 * <p>
 * Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
 * <p>
 * robot.turnRight();
 * robot.stepForward();
 * robot.stepForward();
 * robot.stepForward();
 * <p>
 * <p>
 * P.S. Если вам понравилось это задание, то вам может прийтись по душе игра http://robocode.sourceforge.net/,
 * в которой надо написать алгоритм управления танком. Алгоритмы, написанные разными людьми, соревнуются между собой.
 *
 * @author Alexandr_Firsin
 * @since 2019.03.12
 */
public class Robot {
	public enum Direction {
		UP,
		DOWN,
		LEFT,
		RIGHT
	}

	int x = 0;
	int y = 0;
	Direction direction = Direction.UP;

	public Direction getDirection() {
		return direction;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void turnLeft() {
		System.out.println("Поворот против часовой стрелки");
		if (direction == Direction.DOWN) {
			this.direction = Direction.RIGHT;
			return;
		}

		if (direction == Direction.UP) {
			this.direction = Direction.LEFT;
			return;
		}

		if (direction == Direction.LEFT) {
			this.direction = Direction.DOWN;
			return;
		}

		if (direction == Direction.RIGHT) {
			this.direction = Direction.UP;
			return;
		}
	}

	public void turnRight() {
		System.out.println("поворот по часовой стрелке");
		if (this.direction == Direction.DOWN) {
			System.out.println("Вниз -> влево");
			this.direction = Direction.LEFT;
			return;
		}

		if (this.direction == Direction.UP) {
			System.out.println("Вверх -> вправо");
			this.direction = Direction.RIGHT;
			return;
		}

		if (this.direction == Direction.LEFT) {
			System.out.println("Влево -> вверх");
			this.direction = Direction.UP;
			return;
		}

		if (this.direction == Direction.RIGHT) {
			System.out.println("Вправо -> вниз");
			this.direction = Direction.DOWN;
			return;
		}
	}

	public void stepForward() {
		System.out.println("движение");
		if (direction == Direction.DOWN) {
			System.out.println("вниз");
			this.y--;
		}

		if (direction == Direction.UP) {
			System.out.println("вверх");
			this.y++;
		}

		if (direction == Direction.LEFT) {
			System.out.println("налево");
			this.x--;
		}

		if (direction == Direction.RIGHT) {
			System.out.println("направо");
			this.x++;
		}
	}

	public static void moveRobot(Robot robot, int toX, int toY) {
		while (robot.getDirection() != Direction.UP) {
			robot.turnLeft();
		}
		if (robot.getY() != toY) {
			if (robot.getY() < toY) {
				while (toY != robot.getY()) {
					robot.stepForward();
				}
			} else {
				robot.turnLeft();
				robot.turnLeft();
				while (toY != robot.getY()) {
					robot.stepForward();
				}
			}
		}
		if (robot.getX() != toX) {
			if (robot.getX() < toX) {
				while (robot.getDirection() != Direction.RIGHT) {
					robot.turnLeft();
				}
				while (toX != robot.getX()) {
					robot.stepForward();
				}
			} else {
				while (robot.getDirection() != Direction.LEFT) {
					robot.turnLeft();
				}
				while (toX != robot.getX()) {
					robot.stepForward();
				}
			}
		}
	}

	public static void main(String[] args) {
		Robot robot = new Robot();
		int toX = -1;
		int toY =-1;
		robot.moveRobot(robot, toX, toY);
		System.out.println("X=" + robot.getX() + ", " + "Y=" + robot.getY());
	}
}

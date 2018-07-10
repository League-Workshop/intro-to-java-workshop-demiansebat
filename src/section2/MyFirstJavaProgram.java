package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot java = new Robot();
		java.setSpeed(200);
		java.penDown();
		java.setPenColor(Color.CYAN);
		for (int i = 0; i < 4; i++) {
			java.move(200);
			java.turn(140);
		}

	}
}

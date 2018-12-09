package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot oof = new Robot();
	public static void main(String[] args) {
		oof.show();
		oof.penDown();
		oof.miniaturize();
		for (int i=0; i<10; i++) {
		String wat = JOptionPane.showInputDialog("What do you want the robot to draw? square, triangle, or circle? (no caps)");
		String lol = JOptionPane.showInputDialog("What color do you want the robot to draw with? red, green, or blue? (no caps)");
		if (wat.equals("square")) {
			if (lol.equals("red")) {
				drawSquare(255, 0, 0);
			}else if (lol.equals("green")) {
				drawSquare(0, 255, 0);
			}else if (lol.equals("blue")) {
				drawSquare(0, 0, 255);
			}else {
				JOptionPane.showMessageDialog(null, "Oh No! Something is wrong! (UNKNOWN_COLOR) Check Spelling, No Caps, or Try Again.", "Error", JOptionPane.ERROR_MESSAGE);
			}		
		}else if (wat.equals("triangle")) {
			if (lol.equals("red")) {
				drawTriangle(255, 0, 0);
			}else if (lol.equals("green")) {
				drawTriangle(0, 255, 0);
			}else if (lol.equals("blue")) {
				drawTriangle(0, 0, 255);
			}else {
				JOptionPane.showMessageDialog(null, "Oh No! Something is wrong! (UNKNOWN_COLOR) Check Spelling, No Caps, or Try Again.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}else if (wat.equals("circle")) {
			if (lol.equals("red")) {
				drawCircle(255, 0, 0);
			}else if (lol.equals("green")) {
				drawCircle(0, 255, 0);
			}else if (lol.equals("blue")) {
				drawCircle(0, 0, 255);
			}else {
				JOptionPane.showMessageDialog(null, "Oh No! Something is wrong! (UNKNOWN_COLOR) Check Spelling, No Caps, or Try Again.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Oh No! Something is wrong! (UNKNOWN_SHAPE) Check Spelling, No Caps, or Try Again.", "Error", JOptionPane.ERROR_MESSAGE);
		}}
	}
	static void drawSquare(int red, int green, int blue) {
		oof.setSpeed(70);
		oof.setPenColor(red, green, blue);
		oof.setAngle(0);
		oof.move(100);
		oof.turn(90);
		oof.move(100);
		oof.turn(90);
		oof.move(100);
		oof.turn(90);
		oof.move(100);
	}
	static void drawTriangle(int red, int green, int blue) {
		oof.setSpeed(70);
		oof.setPenColor(red, green, blue);
		oof.setAngle(0);
		oof.move(100);
		oof.turn(240);
		oof.move(100);
		oof.turn(240);
		oof.move(100);
	}
	static void drawCircle(int red, int green, int blue) {
		oof.setSpeed(100);
		oof.setPenColor(red, green, blue);
		oof.setAngle(0);
		for(int i=0; i<361; i++) {
			oof.move(1);
			oof.turn(1);
		}
	}
}

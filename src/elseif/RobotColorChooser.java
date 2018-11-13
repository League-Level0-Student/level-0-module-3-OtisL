//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot robot = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i<10; i++) {
		String color = JOptionPane.showInputDialog("What color do you want to draw? (no caps, plz)");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("red")) {
			robot.setPenColor(255,0,0);
		}else if (color.equals("green")){
			robot.setPenColor(0,255,0);
		}else if(color.equals("blue")) {
			robot.setPenColor(0,0,255);
		}else {
			JOptionPane.showMessageDialog(null, "Sorry, but we cant have your color "+color+". Setting to random.", "No "+color, JOptionPane.ERROR_MESSAGE);
			Random rand = new Random();
			int rand2 = rand.nextInt(3);
			if (rand2 == 0) {
				robot.setPenColor(255,0,0);
			}else if (rand2 == 1) {
				robot.setPenColor(0,255,0);
			}else if (rand2 == 2){
				robot.setPenColor(0,0,255);
			}
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		robot.setSpeed(50);
		//4. Set the pen width to 10
		robot.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		robot.penDown();
		robot.move(100);
		robot.turn(90);
		robot.move(100);
		robot.turn(90);
		robot.move(100);
		robot.turn(90);
		robot.move(100);
		}
	}
}

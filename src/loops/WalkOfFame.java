
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		int g = 80;
		int lol = 30;
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		rob.setX(70);
		rob.setSpeed(100);
		rob.show();
		rob.penDown();
		rob.miniaturize();
		// 2. Make the robot draw a star shape. Hint: 144.
		for (int j=0; j<8; j++) {
			rob.penDown();
			for (int i=0; i<6; i++) {
				rob.move(lol);
				rob.turn(144);
		} 
			rob.penUp();
			rob.setAngle(g);
			g=g+5;
			rob.move(50);
			lol=lol+10;
		}
		// 3. Set the size of the star to 30.
		
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}

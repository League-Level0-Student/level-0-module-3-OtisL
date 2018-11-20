
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "August unknownth";
		String dadsBirthday = "March unknownth";
		String myBirthday = "December 21st";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String want = JOptionPane.showInputDialog("Who's birthday do you want (type exactly as shown): mom dad or mine");
		// 3. Print out what the user typed
		System.out.println(want);
		if (want.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday+" is mom's birthday");
		}else if (want.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday+" is dad's birthday");
		}else if (want.equals("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday+" is my birthday");
		}else {
			JOptionPane.showMessageDialog(null, "Oh No! There's a problem! Either:\n"+"-I don't know "+want+"'s birthday.\n"+"-"+want+" doesn't exist.\n"+"-Unnessasary extra characters in answer.", "Oh No!", JOptionPane.ERROR_MESSAGE);
		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}

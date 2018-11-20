package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String oof = JOptionPane.showInputDialog("What is your star sign? (no caps) "
				+ "https://www.horoscopedates.com/zodiac-signs/");
		if (oof.equals("aries")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (1)");
		}else if (oof.equals("taurus")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (2)");
		}else if (oof.equals("gemini")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (3)");
		}else if (oof.equals("cancer")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (4)");
		}else if (oof.equals("leo")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (5)");
		}else if (oof.equals("virgo")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (6)");
		}else if (oof.equals("libra")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (7)");
		}else if (oof.equals("scorpia")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (8)");
		}else if (oof.equals("sagittarius")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (9)\n" +
					"As Mercury ends its time square with Neptune today someone will try to take advantage of you.\n" + 
					"\n" + 
					"Mercury in Sagittarius ends its time square with Neptune today, and this puts you at risk of others trying to take advantage of you.\n" + 
					"If you have some spare money right now you might find that friends you dont normally hear from suddenly want to spend time with you.\n" + 
					"Think twice before you lend money or treat someone, or offer help, this might not be a genuine need.");
		}else if (oof.equals("capricorn")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (10)");
		}else if (oof.equals("aquarius")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (11)");
		}else if (oof.equals("pisces")) {
			JOptionPane.showMessageDialog(null, "Your Horoscope is: (12)");
		}else {
			JOptionPane.showMessageDialog(null, "Oh Noses! Something seems wrong!\n"+oof+" has thrown an error!\n"+"-Check Spelling\n"+"-Verify no caps\n"+"-Make sure no other words/spaces exist\n"+"Try again by running the program again\n"+"If you keep getting this, there might be a bug", "Oh noses!", JOptionPane.ERROR_MESSAGE);
		}
	}
}

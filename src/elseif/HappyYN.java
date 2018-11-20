package elseif;

import javax.swing.JOptionPane;

public class HappyYN {
	public static void main(String[] args) {
		int AYH = JOptionPane.showOptionDialog(null, "Are you happy?", "ANSWER ME NOW!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		//System.out.println(oof);
		if (AYH == 0) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing", "GOOD YOU", JOptionPane.INFORMATION_MESSAGE);
		}else {
			int DYWTBH = JOptionPane.showOptionDialog(null, "Do you want to be happy?", "YOU NEED TO ANSWER ME!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
			if(DYWTBH == 0) {
				JOptionPane.showMessageDialog(null, "Change something then.", "A MAD MESSAGE", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing", "WOW YOU ARE WEIRD", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}

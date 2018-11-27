package loops;

import javax.swing.JOptionPane;

public class YearsAlive {
	public static void main(String[] args) {
		String oof = JOptionPane.showInputDialog("What is your birth year?");
		int oof2 = Integer.parseInt(oof);
		JOptionPane.showMessageDialog(null, "Check the system output for your years alive.");
		for (;oof2<2019; oof2++) {
			System.out.println("I was alive in "+oof2);
		}
	}
}

package gui;
import javax.swing.JOptionPane;

public class MessageBox {

	public static void main(String[] args) {
		
		String s1 = JOptionPane.showInputDialog(null, "Type the first number");
		int num1 = Integer.parseInt(s1);

		String s2 = JOptionPane.showInputDialog(null, "Type the second number");
		int num2 = Integer.parseInt(s2);
		
		int res = num1 + num2;
		JOptionPane.showInputDialog(null, " The result is "+res);

	}
}
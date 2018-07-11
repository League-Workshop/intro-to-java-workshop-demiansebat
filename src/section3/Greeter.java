package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	JOptionPane.showInputDialog("How are you");
String school=JOptionPane.showInputDialog("What school do you go to");
String grade= JOptionPane.showInputDialog("What grade are you in");
JOptionPane.showMessageDialog(null, "you go to "+ school);
JOptionPane.showMessageDialog(null, "you are in "+grade);
}
}

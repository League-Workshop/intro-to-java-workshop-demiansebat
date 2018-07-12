package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String answer = JOptionPane
				.showInputDialog("how many years would it take to travel all the way around the universe ");
		// 3. Use an if statement to check if their answer is correct
		if (answer.equals("93 billion")) {
			score++;

		}
		String answer2 = JOptionPane.showInputDialog("how many feet long is a regular persons small intestine");
		// 4. if the user's answer is correct
		if (answer2.equals("22")) {
			// -- add one to their score
			score++;
		}
		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		// 6. After all the questions have been asked, print the user's score

	}
}

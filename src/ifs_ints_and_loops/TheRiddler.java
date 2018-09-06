package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle1 = JOptionPane.showInputDialog("You're in a room with 10 candles. You leave \n the room "
		+ "and come back to find that one \n candle went out. You leave again and \n"
		+ "when you come back another \ncandle is out. You notice the window is open \n"
		+ "so you close it to keep more candles from blowing\n out. You check the room the next day.\n"
		+ "How many candles are in the room?"
		);
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle1.equals("2")) {JOptionPane.showMessageDialog(null, "Correct.");
score+=1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {JOptionPane.showMessageDialog(null, "Incorrect. The answer was 2. (You would have 2 candles\n"
		+ "and 8 piles of melted wax.");}
		// 6. Add some more riddles
String riddle2 = JOptionPane.showInputDialog("You're at the bottom of an empty well. The walls around you \n"
		+ "are stones too slick to climb up, and the floor beneath you is dirt. There \n"
		+ "is a shovel with you, but the dirt only goes down for 10 feet before a layer of thick\n"
		+ "stone you cannot dig past. There is a hole in the wall of the well 9 ft high. \n"
		+ "How can you escape?");
if(riddle2.equalsIgnoreCase("Dig the dirt into a pile under the window and climb out.")) {JOptionPane.showMessageDialog(null, "Correct.");
		score+=1;
}
else {JOptionPane.showMessageDialog(null, "Incorrect. The answer was dig the dirt into a pile under the window and climb out");}
		JOptionPane.showMessageDialog(null, "Score:"+score);
	
}}


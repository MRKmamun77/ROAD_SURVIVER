package games;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		GameBoard gb = new GameBoard();
		
		JFrame gameFrame = new JFrame();
		gameFrame.setTitle("ROAD SURVIVER");
		gameFrame.setSize(600, 600);
		gameFrame.add(gb);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
		
		


	}

}

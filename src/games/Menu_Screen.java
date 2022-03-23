package games;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Menu_Screen extends JPanel implements ActionListener{

	JButton play = new JButton("PLAY");
	JButton exit = new JButton("EXIT");
	
	JPanel upper = new JPanel(); 
	JPanel lower = new JPanel(); 
	
	JFrame window = new JFrame();
	
	JLabel imageLabel = new JLabel();
	String imagePaths = "images\\log4.jpg";
	
	public Menu_Screen(){
		
		initUpperPanel();
		initLowerPanel();
		
		
		
		window.setLayout(null);
		
		upper.setBounds(0, 0, 1508, 600);
		lower.setBounds(0,600,1508,100);
		
		window.add(upper);
		window.add(lower);
		window.setTitle("ROAD SURVIVER");
		window.setSize(1024, 750);
		window.setVisible(true);	
		
		ImageIcon icon = new ImageIcon(imagePaths);
		imageLabel.setIcon(icon);
	
		
		
	}
	
public void initUpperPanel(){
		
GridLayout upperLayout = new GridLayout(1,1);
upper.setLayout(upperLayout);
upper.add(imageLabel);
		
	}
	
	public void initLowerPanel(){
		
		GridLayout lowerLayout = new GridLayout(1,2,10,10);
		lower.setLayout(lowerLayout);
		
		lower.add(play);
		lower.add(exit);
		
		play.addActionListener(this);
		exit.addActionListener(this);
		
	}
	
	
		
		public void actionPerformed(ActionEvent e){
			if(e.getSource()== play){
				
			window.dispose();
			}
			
			else if(e.getSource()== exit){
				System.exit(0); 
			}
		}


	
	

}

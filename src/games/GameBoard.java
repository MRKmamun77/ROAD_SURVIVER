package games;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



	public class GameBoard extends JPanel implements KeyListener {
		
		UserCar car1;
		EnemyCar[] enemy1=new EnemyCar[5];
		int  carCount=0;

		public GameBoard(){ 
			super();
			super.addKeyListener(this);
			super.setFocusable(true);   ///  aitar  kaaj  ki ?????
			car1= new UserCar(250,600,"images//Cars10.png",true);
			
			int xPos = 0;
			for(int i = 0;  i < enemy1.length; i++){
				enemy1[i] = new EnemyCar(xPos,-100, "images//Cars40.png");
				xPos += 175; 
			}
			for(int i = 0;  i < enemy1.length; i++){
				EnemyMove em = new EnemyMove(this,car1,enemy1[i],(int)(Math.random()* 30+125));
				em.start();
			}
			
			//enemy1 = new EnemyCar(200,0,"images//enemycar.png");
	}
		public void paint(Graphics g){
			
			ImageIcon background = new ImageIcon("images//background1.png");
			g.drawImage(background.getImage(),0,0,null);
			car1.draw(g);
			for(int i = 0; i < enemy1.length; i++){
				enemy1[i].draw(g);
			
			enemy1[i].draw(g);
			}
			
		}
		
		public void keyPressed(KeyEvent e) {
			
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				
				if(car1.getX() > 0)
					car1.setX(car1.getX() - 5);
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				
				if(car1.getX() < 700)
					car1.setX(car1.getX() + 5);
			}	
			
			else if(e.getKeyCode() == KeyEvent.VK_UP){
				
				if(car1.getY() > 0)
					car1.setY(car1.getY() - 5);
			}
			
			else if(e.getKeyCode() == KeyEvent.VK_DOWN){
				
				if(car1.getY() < 400)
					car1.setY(car1.getY() + 5);
			//up and down	
				
			}
			/*else if(e.getKeyCode() == e.VK_SPACE){
				
				enemy1[carCount].setX(car1.getX() - 25);
				enemy1[carCount].setY(car1.getY());
			
				
				//EnemyMove em = new EnemyMove(this,car1,enemy1[carCount]);
				//em.start();
				carCount++;
				if(carCount == 10)
					carCount = 0;
			
*/
			//super.repaint();
			//}
			super.repaint();
			 
		}
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		
			
		}

	}




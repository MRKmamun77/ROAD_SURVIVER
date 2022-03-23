package games;

import java.awt.*;

public class EnemyMove extends Thread {
	
	private GameBoard board;
	private UserCar user;
	private EnemyCar enemy;
	private int time;
	
	
	public EnemyMove(GameBoard board, UserCar user, EnemyCar enemy,int time) {
		super();
		this.board = board;
		this.user = user;
		this.enemy = enemy;
		this.time = time;
	}

	public void run(){
			
			while(true){
				
				enemy.setY(enemy.getY() + 5);
				if(enemy.getY() > 1000)
					enemy.setY(-50);
				checkCollision();
				try {
					Thread.sleep(15);
				}
				catch (Exception e) {
					System.out.println(e);
				}
				
				board.repaint();
			}
			
		}
		
		public void checkCollision(){
			
			Rectangle userRect = new Rectangle(user.getX(),user.getY(),66,126);
			
			Rectangle enemyRect = new Rectangle(enemy.getX(),enemy.getY(),59,125);
			
			
			if(enemyRect.intersects(userRect) == true){
					//user.setX(-500);
					enemy.setX(5000);
					
					
				}
			
		}
}

	
	
	
	
	
	


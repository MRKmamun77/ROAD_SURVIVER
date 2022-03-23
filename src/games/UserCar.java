package games;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class UserCar{
	private int x,y;
	private String imagePath;
	private boolean isAlive;
	
    public UserCar(int x, int y, String imagePath,boolean isAlive) {
		this.x= x;
		this.y= y;
		this.imagePath = imagePath;
		this.isAlive=isAlive;
		
    }
    
	public void draw(Graphics g){
  		
		ImageIcon usercar= new ImageIcon(imagePath);
  		g.drawImage(usercar.getImage(), x, y, null);
  		
  	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getImagePath() {
		return imagePath;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}


}

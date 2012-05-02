package com.game.sprites;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class CarSprite {

	private static final int RIGHT_BOUNDARY = 280;
	int x;
	int y;
	int xDirection;
	int yDirection;
	int width;
	int height;
	Image image;
	
	String carSprite = "Basketball_48x48.png";
	
	public CarSprite(){
		ImageIcon ii = new ImageIcon(this.getClass().getResource(carSprite));
		image = ii.getImage();
		
		this.width = image.getWidth(null);
		this.height = image.getHeight(null);
	}
	
	public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            xDirection += -4;

        }

        if (key == KeyEvent.VK_RIGHT) {
            xDirection += 4;
        }
        
        if(key == KeyEvent.VK_UP){
        	yDirection += -4;
        }
        
        if(key == KeyEvent.VK_DOWN){
        	yDirection += 4;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            //xDirection= 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            //xDirection = 0;
        }
    }
	
	public void move(){
		x += xDirection;
		y += yDirection;
		
		if(xDirection == 0){
			setxDirection(1);
		}
		
		if(xDirection == RIGHT_BOUNDARY){
			setxDirection(-1);
		}
		
		if(yDirection == 0){
			setyDirection(1);
		}
	}
	
	public void resetDirectionState(){
		x = 230;
		y = 355;

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

	public int getxDirection() {
		return xDirection;
	}

	public void setxDirection(int xDirection) {
		this.xDirection = xDirection;
	}

	public int getyDirection() {
		return yDirection;
	}

	public void setyDirection(int yDirection) {
		this.yDirection = yDirection;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getCarSprite() {
		return carSprite;
	}

	public void setCarSprite(String carSprite) {
		this.carSprite = carSprite;
	}
	
	
}

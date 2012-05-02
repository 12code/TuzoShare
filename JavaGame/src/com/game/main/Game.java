package com.game.main;


import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

import com.game.sprites.CarSprite;

public class Game extends JPanel{

	Timer timer;
	CarSprite sprite;
	
	public Game(){
		addKeyListener(new TAdapter());
        setFocusable(true);

        setDoubleBuffered(true);
        timer = new Timer();
        timer.scheduleAtFixedRate(new GameTimerTask(), 1000, 10);
	}
	
	private void init() {
		sprite = new CarSprite();
	}

	class GameTimerTask extends TimerTask{

		@Override
		public void run() {
			sprite.move();
			repaint();
		}

	}
	
	 public void addNotify() {
         super.addNotify();
         init();
     }

	
	private class TAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            sprite.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            sprite.keyPressed(e);
        }
    }


	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(this.sprite.getImage(),this.sprite.getxDirection(),this.sprite.getyDirection(),this);
		Toolkit.getDefaultToolkit().sync();
        g.dispose();

	}
}

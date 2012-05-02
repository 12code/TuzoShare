package com.game.main;

import javax.swing.JFrame;

public class GameRunner extends JFrame{

	public GameRunner(){
		add(new Game());
        setTitle("Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(230, 355);
        setLocationRelativeTo(null);
        setIgnoreRepaint(true);
        setResizable(false);
        setVisible(true);
	}
	
	public static void main(String[] args) {
        new GameRunner();
    }

}

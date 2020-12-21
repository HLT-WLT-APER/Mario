package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Substance.BackGround;
import Substance.Ground;
import Substance.Wall;
import base.Music;
import base.Element;
import player.Gravity;
import base.Keys;
import base.Map;
import player.Player;
import player.PlayerMove;

public class Frame extends JFrame
{
	Keys keys;
	public Frame() throws InterruptedException, LineUnavailableException, UnsupportedAudioFileException, IOException
	{
		init();
		setVisible(true);
		run();
	}
	void init() throws LineUnavailableException, UnsupportedAudioFileException, IOException
	{
		setTitle("2018330301052_À×ÕÜ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1366,728);
		setResizable(false);
		
		Panel panel = new Panel();
		add(panel);
		
		keys = new Keys();
		this.addKeyListener(new KeyListener()
		{
			public void keyTyped(KeyEvent e) {}
			public void keyPressed(KeyEvent e)
			{
				keys.add(e.getKeyCode());
				if ( e.getKeyCode()==KeyEvent.VK_A)
				{
					panel.getPlayer().setNum(3);
				}
				if ( e.getKeyCode()==KeyEvent.VK_D)
				{
					panel.getPlayer().setNum(1);
				} 
			}
			public void keyReleased(KeyEvent e) 
			{
				keys.remove(e.getKeyCode());
				if ( e.getKeyCode()==KeyEvent.VK_A)
				{
					panel.getPlayer().setNum(2);
				} 
				if ( e.getKeyCode()==KeyEvent.VK_D)
				{
					panel.getPlayer().setNum(0);
				} 
			}
		});
		PlayerMove pm = new PlayerMove(panel.getPlayer(),keys,panel.getMap(),panel.getMusic());
		pm.start();
	}
	
	public void run() throws InterruptedException
	{
		while(true)
		{
			Thread.sleep(5);
			repaint();
		}
	}
}

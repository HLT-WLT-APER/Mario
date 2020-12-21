package main;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JPanel;

import Substance.BackGround;
import Substance.Ground;
import monster.Monster;
import monster.MonsterMove;
import Substance.Pipe;
import Substance.Tower;
import Substance.Wall;
import base.Keys;
import base.Map;
import base.Music;
import player.Gravity;
import player.Player;
import player.PlayerMove;

public class Panel extends JPanel
{
	private Player player;
	private Map map;
	private  ArrayList<BackGround> bgs;
	private  ArrayList<Ground> gs;
	private  ArrayList<Wall> walls;
	private  ArrayList<Pipe> pipes;
	private  ArrayList<Monster> monsters;
	private Tower tower;
	private Music music;
	public Panel() throws IOException, LineUnavailableException, UnsupportedAudioFileException
	{
		map = new Map();
		bgs = map.getBG();
		gs = map.getGR();
		walls = map.getWalls();
		pipes = map.getPipes();
		tower = map.getTower();
		monsters = map.getMonsters();
		
		player = new Player();
		player.setY(350);
		
		MonsterMove mv = new MonsterMove(map);
		mv.start();
		
		Gravity g =new Gravity(player,map);
		g.start();
		
		music = new Music();
		music.backGroundMusic.loop(10000);
	}
	public void paint(Graphics g)
	{
		for(BackGround bg : bgs)
		{
			g.drawImage(bg.getImage(),bg.getX(),bg.getY(),bg.getW(),bg.getH(),this);
		}
		for(Ground gr : gs)
		{
			g.drawImage(gr.getImage(),gr.getX(),gr.getY(),gr.getW(),gr.getH(),this);
		}
		for(Wall wall : walls)
		{
			g.drawImage(wall.getImage(),wall.getX(),wall.getY(),wall.getW(),wall.getH(),this);
		}
		for(Pipe pipe : pipes)
		{
			g.drawImage(pipe.getImage(),pipe.getX(),pipe.getY(),pipe.getW(),pipe.getH(),this);
		}
		for(Monster monster : monsters)
		{
			g.drawImage(monster.getImage(),monster.getX(),monster.getY(),monster.getW(),monster.getH(),this);
		}
		g.drawImage(player.getImage(),player.getX(),player.getY(),player.getW(),player.getH(),this);
		g.drawImage(tower.getImage(),tower.getX(),tower.getY(),tower.getW(),tower.getH(),this);
	}
	public Player getPlayer()
	{
		return player;
	}
	public Music getMusic()
	{
		return music;
	}
	public Map getMap()
	{
		return map;
	}
}

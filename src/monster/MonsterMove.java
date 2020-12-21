package monster;

import java.util.ArrayList;

import Substance.Pipe;
import Substance.Wall;
import base.Map;

public class MonsterMove extends Thread
{
	Map map;
	private ArrayList<Monster> monsters;
	private  ArrayList<Wall> walls;
	private  ArrayList<Pipe> pipes;
	public MonsterMove(Map map)
	{
		this.map = map;
		monsters = map.getMonsters();
		walls = map.getWalls();
		pipes = map.getPipes();
	}
	public void run()
	{
		int speed=1;
		boolean flag=false;
		while(true)
		{
			try 
			{
				Thread.sleep(10);
			} 
			catch (InterruptedException e) {e.printStackTrace();}
			for(Monster monster : monsters)
			{
				monster.setX(monster.getX()+speed);
			}
			for(Wall wall : walls)
			{
				for(Monster monster : monsters)
				{
					if(monster.getRec().intersects(wall.getRec()))
					{
						speed=-speed;
						flag=true;
					}
				}
			}
			for(Pipe pipe : pipes)
			{
				for(Monster monster : monsters)
				{
					if(monster.getRec().intersects(pipe.getRec()))
					{
						speed=-speed;
						flag= true;
					}
				}
			}
			if(flag==true)
			{
				for(Monster monster : monsters)
				{
					monster.setNum(monster.getNum() ^ 1);
					flag=false;
				}
			}
		}
	}
}

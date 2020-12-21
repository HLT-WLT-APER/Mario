package player;

import java.util.ArrayList;

import Substance.Pipe;
import Substance.Wall;
import base.Element;
import base.Map;

public class Gravity extends Thread
{
	Player p;
	Map map;
	private ArrayList<Wall> walls;
	private ArrayList<Pipe> pipes;
	boolean flag;
	public Gravity(Player p,Map map)
	{
		this.p=p;
		this.map = map;
		walls = map.getWalls();
		pipes = map.getPipes();
	}
	public void run()
	{
		while(true)
		{
			flag=false;
			for(Wall wall : walls)
			{
				if(p.getY()>=600||(p.getRec().intersects(wall.getRec())&&p.getRec().getY()+p.getRec().getHeight()<=wall.getRec().getY()+10&&p.getRec().getX()+p.getRec().getWidth()>=wall.getRec().getX()+10&&p.getRec().getX()<=wall.getRec().getX()+wall.getRec().getWidth()-10))
				{
					flag=true;
					break;
				}
			}
			for(Pipe pipe : pipes)
			{
				if(p.getY()>=600||(p.getRec().intersects(pipe.getRec())&&p.getRec().getY()+p.getRec().getHeight()<=pipe.getRec().getY()+10&&p.getRec().getX()+p.getRec().getWidth()>=pipe.getRec().getX()+10&&p.getRec().getX()<=pipe.getRec().getX()+pipe.getRec().getWidth()-10))
				{
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				p.setJump(true);
			}
			else
			{
				p.setY(p.getY()+5);
			}
			try 
			{
				Thread.sleep(10);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

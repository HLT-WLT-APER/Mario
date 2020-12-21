package player;

import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import Substance.BackGround;
import Substance.Ground;
import Substance.Pipe;
import Substance.Tower;
import Substance.Wall;
import base.Element;
import base.Keys;
import base.Map;
import base.Music;
import monster.Monster;

public class PlayerMove extends Thread
{
	Player player;
	Keys keys;
	Map map;
	boolean flag;
	private ArrayList<BackGround> bgs;
	private ArrayList<Ground> gs;
	private ArrayList<Wall> walls;
	private ArrayList<Pipe> pipes;
	private ArrayList<Monster> monsters;
	private Tower tower;
	private Music music;
	public PlayerMove(Player player,Keys keys,Map map,Music music) throws LineUnavailableException, UnsupportedAudioFileException, IOException
	{
		this.player = player;
		this.keys=keys;
		this.map = map;
		this.pipes = map.getPipes();
		tower = map.getTower();
		bgs = map.getBG();
		gs = map.getGR();
		walls = map.getWalls();
		monsters = map.getMonsters();
		this.music = music;
	}
	public synchronized void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(5);
			} 
			catch (InterruptedException e) {e.printStackTrace();}
			
			for(Monster monster : monsters)
			{
				if(player.getRec().intersects(monster.getRec())&&player.getY()+player.getRec().getHeight()<=monster.getRec().getY()+10)
				{
					monster.setNum(1);
					monster.setW(0);
					monster.setH(0);
					player.setY(player.getY()-60);
				}
				if(player.getRec().intersects(monster.getRec())&&player.getY()+player.getRec().getHeight()>=monster.getRec().getY()+10)
				{
					music.backGroundMusic.stop();
					music.death1.start();
					music.death2.start();
					player.setH(0);
					player.setW(0);
					try {
						Thread.sleep(2500);
					} 
					catch (InterruptedException e) {e.printStackTrace();}
					System.exit(1);
				}
			}
			
			if(keys.have(65)==true)
			{
				flag=false;
				for(Wall wall : walls)
				{
					if(player.getRec().intersects(wall.getRec())&&player.getRec().getX()>=wall.getRec().getX()+wall.getRec().getWidth()-20&&(player.getRec().getY()<=wall.getRec().getY()+wall.getRec().getHeight()-10&&player.getRec().getY()+player.getRec().getHeight()>=wall.getRec().getY()+10))//
					{
						flag=true;
					}
				}
				for(Pipe pipe : pipes)
				{
					if(player.getRec().intersects(pipe.getRec())&&player.getRec().getX()>=pipe.getRec().getX()+pipe.getRec().getWidth()-20&&(player.getRec().getY()<=pipe.getRec().getY()+pipe.getRec().getHeight()-10&&player.getRec().getY()+player.getRec().getHeight()>=pipe.getRec().getY()+10))//
					{
						flag=true;
					}
				}
				if(flag==true){}
				else
				{
					player.setX(player.getX()-1);
				}
			}
			if(keys.have(68)==true)
			{
				flag=false;
				for(Wall wall : walls)
				{
					if(player.getRec().intersects(wall.getRec())&&player.getRec().getX()+player.getRec().getWidth()<=wall.getRec().getX()+20&&(player.getRec().getY()<=wall.getRec().getY()+wall.getRec().getHeight()-10&&player.getRec().getY()+player.getRec().getHeight()>=wall.getRec().getY()+10))//
					{
						flag=true;
					}
				}
				for(Pipe pipe : pipes)
				{
					if(player.getRec().intersects(pipe.getRec())&&player.getRec().getX()+player.getRec().getWidth()<=pipe.getRec().getX()+20&&(player.getRec().getY()<=pipe.getRec().getY()+pipe.getRec().getHeight()-10&&player.getRec().getY()+player.getRec().getHeight()>=pipe.getRec().getY()+10))//
					{
						flag=true;
					}
				}
				if(flag==true){}
				else
				{
					if(player.getX()<700)
					{
						player.setX(player.getX()+1);
					}
					else
					{
						for(Wall wall : walls)
						{
							wall.setX(wall.getX()-1);
						}
						for(Pipe pipe : pipes)
						{
							pipe.setX(pipe.getX()-1);
						}
						for(BackGround bg : bgs)
						{
							bg.setX(bg.getX()-1);
						}
						for(Ground gr : gs)
						{
							gr.setX(gr.getX()-1);
						}
						for(Monster monster : monsters)
						{
							monster.setX(monster.getX()-1);
						}
						tower.setX(tower.getX()-1);
						if(tower.getX()<1066)
						{
								music.backGroundMusic.stop();
								music.success.start();
							
							try 
							{
								
								for(int i=1;i<=400;i++)
								{
									player.setNum(1);
									player.setX(player.getX()+1);
									Thread.sleep(5);
								}
							} 
							catch (InterruptedException e) {e.printStackTrace();}
							
							try 
							{
								Thread.sleep(5000);
							} 
							catch (InterruptedException e) {e.printStackTrace();}
							System.exit(1);
						}
					}
				}
			}
			if(keys.have(74)==true)
			{
				new  Thread()
				{
					public void run()
					{
						if(player.canJump()==true)
						{
							music.jump.start();
							music.jump.setMicrosecondPosition(0);
							player.setJump(false);
							for(int i=1;i<=10;i++)
							{
								flag=false;
								for(Wall wall : walls)
								{
									if(player.getRec().intersects(wall.getRec())&&player.getY()<=wall.getRec().getY()+wall.getH()-5&&player.getY()>=wall.getRec().getY()&&player.getRec().getX()+player.getRec().getWidth()>wall.getRec().getX()+10&&player.getRec().getX()<wall.getRec().getX()+wall.getRec().getWidth()-10)
									{
										flag=true;
									}
								}
								for(Pipe pipe : pipes)
								{
									if(player.getRec().intersects(pipe.getRec())&&player.getY()<=pipe.getRec().getY()+pipe.getH()-5&&player.getY()>=pipe.getRec().getY()&&player.getRec().getX()+player.getRec().getWidth()>pipe.getRec().getX()+10&&player.getRec().getX()<pipe.getRec().getX()+pipe.getRec().getWidth()-10)
									{
										flag=true;
									}
								}
								if(flag==true) {}
								else
								{
									player.setY(player.getY()-30);
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
				}.start();
			}
		}
	}
}

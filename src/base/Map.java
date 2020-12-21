package base;

import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

import Substance.BackGround;
import Substance.Ground;
import monster.Monster;
import Substance.Pipe;
import Substance.Tower;
import Substance.Wall;

public class Map 
{
	private ArrayList<BackGround> bgs;
	private ArrayList<Ground> gs;
	private ArrayList<Wall> walls;
	private ArrayList<Pipe> pipes;
	private ArrayList<Monster> monsters;
	private Tower tower;
	public Map() throws IOException
	{
		bgs = new ArrayList<>();
		gs = new ArrayList<>();
		walls = new ArrayList<>();
		pipes = new ArrayList<>();
		pipes = new ArrayList<>();
		monsters = new ArrayList<>();
		BackGround bg1 = new BackGround(0,0,1366,728);
		BackGround bg2 = new BackGround(1366,0,1366,728);
		BackGround bg3 = new BackGround(2732,0,1366,728);
		bgs.add(bg1);
		bgs.add(bg2);
		bgs.add(bg3);
		Ground g1 = new Ground(0,650,1366,78);
		Ground g2 = new Ground(1366,650,1366,78);
		Ground g3 = new Ground(2732,650,1366,78);
		gs.add(g1);
		gs.add(g2);
		gs.add(g3);
		Wall wall1= new Wall(600,600,50,50);
		Wall wall2= new Wall(700,550,50,50);
		Wall wall3= new Wall(800,500,50,50);
		Wall wall4= new Wall(900,450,50,50);
		Wall wall5= new Wall(1000,400,50,50);
		Wall wall6= new Wall(1100,450,50,50);
		Wall wall7= new Wall(1100,400,50,50);
		Wall wall8= new Wall(1100,350,50,50);
		Wall wall9= new Wall(1500,500,50,50);
		Wall wall10= new Wall(1600,400,50,50);
		Wall wall11= new Wall(1650,400,50,50);
		Wall wall12= new Wall(1700,400,50,50);
		Wall wall13= new Wall(1750,400,50,50);
		Wall wall14= new Wall(1800,400,50,50);
		Wall wall15= new Wall(1100,500,50,50);
		Wall wall16= new Wall(1100,550,50,50);
		Wall wall17= new Wall(1100,600,50,50);
		Wall wall18= new Wall(1900,500,50,50);
		Wall wall19= new Wall(3100,100,50,50);
		Wall wall20= new Wall(3100,600,50,50);
		Wall wall21= new Wall(3100,550,50,50);
		Wall wall22= new Wall(3100,500,50,50);
		Wall wall23= new Wall(3100,450,50,50);
		Wall wall24= new Wall(3100,350,50,50);
		Wall wall25= new Wall(3100,300,50,50);
		Wall wall26= new Wall(3100,250,50,50);
		Wall wall27= new Wall(3100,200,50,50);
		Wall wall28= new Wall(3100,150,50,50);
		walls.add(wall1);
		walls.add(wall2);
		walls.add(wall3);
		walls.add(wall4);
		walls.add(wall5);
		walls.add(wall6);
		walls.add(wall7);
		walls.add(wall8);
		walls.add(wall9);
		walls.add(wall10);
		walls.add(wall11);
		walls.add(wall12);
		walls.add(wall13);
		walls.add(wall14);
		walls.add(wall15);
		walls.add(wall16);
		walls.add(wall17);
		walls.add(wall18);
		walls.add(wall19);
		walls.add(wall20);
		walls.add(wall21);
		walls.add(wall22);
		walls.add(wall23);
		walls.add(wall24);
		walls.add(wall25);
		walls.add(wall26);
		walls.add(wall27);
		walls.add(wall28);
		Pipe pipe1 = new Pipe(2500,520,70,130);
		Pipe pipe2 = new Pipe(2800,520,70,130);
		pipes.add(pipe1);
		pipes.add(pipe2);
		tower = new Tower(3800,350,300,300);
		Monster monster1 = new Monster(1150,600,50,50);
		Monster monster2 = new Monster(1250,600,50,50);
		monsters.add(monster1);
		monsters.add(monster2);
	}
	public ArrayList<BackGround> getBG()
	{
		return bgs;
	}
	public ArrayList<Ground> getGR()
	{
		return gs;
	}
	public ArrayList<Wall> getWalls()
	{
		return walls;
	}
	public ArrayList<Pipe> getPipes()
	{
		return pipes;
	}
	public Tower getTower()
	{
		return tower;
	}
	public ArrayList<Monster> getMonsters()
	{ 
		return monsters;
	}
}

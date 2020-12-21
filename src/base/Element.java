package base;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import Substance.Wall;

public abstract class Element
{
	protected int x,y,w,h,num=0;
	protected ArrayList<Image>images;
	protected Image image;
	protected Rectangle rec;
	public Element() throws IOException
	{		
		images = new ArrayList<>();
	}
	public ArrayList<Image> getImages()
	{
		return images;
	}
	public Image getImage()
	{
		return images.get(num);
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	public void setX(int x)
	{
		this.x=x;
	}
	public int getX()
	{
		return x;
	}
	public void setY(int y)
	{
		this.y=y;
	}
	public int getY()
	{
		return y;
	}
	public void setW(int w)
	{
		this.w=w;
	}
	public int getW()
	{
		return w;
	}
	public void setH(int h)
	{
		this.h=h;
	}
	public int getH()
	{
		return h;
	}
	public Rectangle getRec()
	{
		rec = new Rectangle(x,y,w,h);
		return rec;
	}
}

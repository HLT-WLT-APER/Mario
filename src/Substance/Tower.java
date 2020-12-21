package Substance;

import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;

import base.Element;

public class Tower extends Element
{
	public Tower(int x,int y,int w,int h) throws IOException 
	{
		super();
		Image ima=new ImageIcon("src/resources/images/tower.png").getImage();
		images.add(ima);
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		num=0;
	}
}

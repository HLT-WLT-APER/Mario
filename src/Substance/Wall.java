package Substance;

import java.awt.Image;
import java.io.IOException;

import javax.swing.ImageIcon;

import base.Element;

public class Wall extends Element
{
	public Wall(int x,int y,int w,int h) throws IOException 
	{
		super();
		Image ima=new ImageIcon("src/resources/images/wall/normalwall.png").getImage();
		images.add(ima);
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		num=0;
	}
	
}

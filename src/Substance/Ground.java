package Substance;

import java.awt.Image;
import java.io.IOException;

import javax.swing.ImageIcon;

import base.Element;

public class Ground extends Element
{
	public Ground(int x,int y,int w,int h) throws IOException 
	{
		super();
		Image ground = new ImageIcon("src/resources/images/ground.png").getImage();
		images.add(ground);
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
		num=0;
	}
}

package Substance;

import java.awt.Image;
import java.io.IOException;

import javax.swing.ImageIcon;

import base.Element;

public class BackGround extends Element
{
	public BackGround(int x,int y,int w,int h) throws IOException 
	{
		super();
		Image bg = new ImageIcon("src/resources/images/background.png").getImage();
		images.add(bg);
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
}

package monster;

import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import base.Element;

public class Monster extends Element
{
	public Monster(int x,int y,int w,int h) throws IOException 
	{
		super();
		Image mon = new ImageIcon("src/resources/images/monster/1.gif").getImage();
		images.add(mon);
		mon = new ImageIcon("src/resources/images/monster/2.gif").getImage();
		images.add(mon);
		mon = new ImageIcon("src/resources/images/monster/3 .gif").getImage();
		images.add(mon);
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
}

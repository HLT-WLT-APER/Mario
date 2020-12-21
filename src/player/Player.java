package player;

import java.awt.Image;
import java.io.IOException;
import javax.swing.ImageIcon;
import base.Element;

public class Player extends Element
{
	private boolean jump = true;
	public Player() throws IOException 
	{
		super();
		Image ima=new ImageIcon("src/resources/images/mario/smallmario/marioR/stand.png").getImage();
		images.add(ima);
		ima=new ImageIcon("src/resources/images/mario/smallmario/marioR/run.gif").getImage();
		images.add(ima);
		ima=new ImageIcon("src/resources/images/mario/smallmario/marioL/stand.png").getImage();
		images.add(ima);
		ima=new ImageIcon("src/resources/images/mario/smallmario/marioL/run.gif").getImage();
		images.add(ima);
		x=56;
		y=58;
		w=50;
		h=50;
		num=0;
	}
	public boolean canJump()
	{
		return jump;
	}
	public void setJump(boolean b)
	{
		jump=b;
	}
}

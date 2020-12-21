package main;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main 
{
	public static void main(String[] args) throws InterruptedException, LineUnavailableException, UnsupportedAudioFileException, IOException 
	{
		Frame f = new Frame();
	}
}
/*游戏说明:
A向左移动 D向右移动 J实现跳跃功能
因为输入法等其他未知原因，可能出现无法跳跃情况，请重新进入游戏并先关闭输入法再移动
*/
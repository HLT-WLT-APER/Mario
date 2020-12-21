package base;

import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music
{
	public static Clip backGroundMusic=null;
	public static AudioInputStream backGroundMusicLoad=null;
	public static Clip killEnemy=null;
	public static AudioInputStream killEnemyLoad=null;
	public static Clip success=null;
	public static AudioInputStream successLoad=null;
	public static Clip eatFlower=null;
	public static AudioInputStream eatFlowerLoad=null;
	public static Clip eatCoins=null;
	public static AudioInputStream eatCoinsLoad=null;
	public static Clip mushroom=null;
	public static AudioInputStream mushroomLoad=null;
	public static Clip brick=null;
	public static AudioInputStream brickLoad=null;
	public static Clip death1=null;
	public static AudioInputStream death1Load=null;
	public static Clip death2=null;
	public static AudioInputStream death2Load=null;
	public static Clip jump=null;
	public static AudioInputStream jumpLoad=null;
	public Music() throws LineUnavailableException, UnsupportedAudioFileException, IOException
	{
			backGroundMusicLoad=AudioSystem.getAudioInputStream(new File("src/resources/music/bgm.wav")); 
			backGroundMusic=AudioSystem.getClip();
			backGroundMusic.open(backGroundMusicLoad);
			killEnemyLoad=AudioSystem.getAudioInputStream(new File("src/resources/music/²ÈµÐÈË.wav")); 
			killEnemy=AudioSystem.getClip();
			killEnemy.open(killEnemyLoad);
			successLoad=AudioSystem.getAudioInputStream(new File("src/resources/music/³Ç±¤Í¨¹Ø.wav")); 
			success=AudioSystem.getClip();
			success.open(successLoad);
			eatFlowerLoad=AudioSystem.getAudioInputStream(new File("src/resources/music/³Ôµ½Ä¢¹½»ò»¨.wav")); 
			eatFlower=AudioSystem.getClip();
			eatFlower.open(eatFlowerLoad);
			eatCoinsLoad=AudioSystem.getAudioInputStream(new File("src/resources/music/³Ô½ð±Ò.wav")); 
			eatCoins=AudioSystem.getClip();
			eatCoins.open(eatCoinsLoad);
			mushroomLoad=AudioSystem.getAudioInputStream(new File("src/resources/music/¶¥³öÄ¢¹½,»¨»òÐÇ.wav")); 
			mushroom=AudioSystem.getClip();
			mushroom.open(mushroomLoad);
			brickLoad=AudioSystem.getAudioInputStream(new File("src/resources/music/¶¥ÆÆ×©.wav")); 
			brick=AudioSystem.getClip();
			brick.open(brickLoad);
			death1Load=AudioSystem.getAudioInputStream(new File("src/resources/music/ËÀÍö1.wav")); 
			death1=AudioSystem.getClip();
			death1.open(death1Load);
			death2Load=AudioSystem.getAudioInputStream(new File("src/resources/music/ËÀÍö2.wav")); 
			death2=AudioSystem.getClip();
			death2.open(death2Load);
			jumpLoad=AudioSystem.getAudioInputStream(new File("src/resources/music/Ìø.wav")); 
			jump=AudioSystem.getClip();
			jump.open(jumpLoad);
	}
	public void playBGM()
	{
		backGroundMusic.loop(Clip.LOOP_CONTINUOUSLY);
	}
}

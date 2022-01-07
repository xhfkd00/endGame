import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;


public class MusicStartThread extends Thread {
	
	Clip backGroundMusicclip;
	
	@Override
	public void run() {
		try {
			AudioInputStream test = AudioSystem.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\test.wav"));
			backGroundMusicclip = AudioSystem.getClip();
			backGroundMusicclip.open(test);
			backGroundMusicclip.start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//	public void stop() {
//		backGroundMusicclip.stop();
//	}

}

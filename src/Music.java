import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music {
	
	Clip backGroundMusicclip;

	public Music() {
		
		try {
			AudioInputStream test = AudioSystem.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\test.wav"));
			backGroundMusicclip = AudioSystem.getClip();
			backGroundMusicclip.open(test);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void BackGroundMusicStart() {
		backGroundMusicclip.start();

	}
	public void BackGroundMusicStop() {
		backGroundMusicclip.stop();
	}
}

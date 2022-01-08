import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicThread extends Thread {

	Clip backGroundMusicclip;
	Clip tripleShot;
	Clip headShot;
	Clip stormyPoems;
	Clip snail;
	Clip ballock;
	Clip ballockSwingTail;
	Clip ballockEnergyExplosion;
	Clip attack;
	Clip ballockAttack;

	@Override
	public void run() {
		try {

			AudioInputStream backGroundMusic = AudioSystem
					.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\พ๎ด๐ลอม๎\\mugic\\bgm.wav"));
			backGroundMusicclip = AudioSystem.getClip();
			backGroundMusicclip.open(backGroundMusic);
			backGroundMusicclip.loop(Clip.LOOP_CONTINUOUSLY);
			backGroundMusicclip.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void BackGroundMusicClose() {
		backGroundMusicclip.stop();
	}

	public void TripleShot() {
		try {

			AudioInputStream tripleShotMusic = AudioSystem
					.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\พ๎ด๐ลอม๎\\mugic\\tripleshot.wav"));
			tripleShot = AudioSystem.getClip();
			tripleShot.open(tripleShotMusic);
			tripleShot.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void TripleShotClose() {
		tripleShot.stop();
	}

	public void HeadShot() {
		try {

			AudioInputStream headShotMusic = AudioSystem
					.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\พ๎ด๐ลอม๎\\mugic\\headshot.wav"));
			headShot = AudioSystem.getClip();
			headShot.open(headShotMusic);
			headShot.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void HeadShotClose() {
		headShot.stop();
	}
	
	public void stormyPoems() {
		try {

			AudioInputStream stormyPoemsMusic = AudioSystem
					.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\พ๎ด๐ลอม๎\\mugic\\stormypoems.wav"));
			stormyPoems = AudioSystem.getClip();
			stormyPoems.open(stormyPoemsMusic);
			stormyPoems.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void StormyPoemsClose() {
		stormyPoems.stop();
	}
	
	public void Snail() {
		try {

			AudioInputStream SnailMusic = AudioSystem
					.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\พ๎ด๐ลอม๎\\mugic\\snail.wav"));
			snail = AudioSystem.getClip();
			snail.open(SnailMusic);
			snail.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void SnailClose() {
		snail.stop();
	}
	
	
	public void Ballock() {
		try {

			AudioInputStream BallockMusic = AudioSystem
					.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\พ๎ด๐ลอม๎\\mugic\\ballock.wav"));
			ballock = AudioSystem.getClip();
			ballock.open(BallockMusic);
			ballock.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void BallockClose() {
		ballock.stop();
	}
	
	
	public void BallockSwingTail() {
		try {

			AudioInputStream BallockSwingTailMusic = AudioSystem
					.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\พ๎ด๐ลอม๎\\mugic\\swingtail.wav"));
			ballockSwingTail = AudioSystem.getClip();
			ballockSwingTail.open(BallockSwingTailMusic);
			ballockSwingTail.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void BallockSwingTailClose() {
		ballockSwingTail.stop();
	}

	
	
	public void BallockEnergyExplosion() {
		try {

			AudioInputStream BallockEnergyExplosionMusic = AudioSystem
					.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\พ๎ด๐ลอม๎\\mugic\\energyexplosion.wav"));
			ballockEnergyExplosion = AudioSystem.getClip();
			ballockEnergyExplosion.open(BallockEnergyExplosionMusic);
			ballockEnergyExplosion.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void BallockEnergyExplosionClose() {
		ballockEnergyExplosion.stop();
	}
	
	public void Attack() {
		try {

			AudioInputStream AttackMusic = AudioSystem
					.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\พ๎ด๐ลอม๎\\mugic\\attack.wav"));
			attack = AudioSystem.getClip();
			attack.open(AttackMusic);
			attack.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void AttackClose() {
		attack.stop();
	}
	
	public void BallockAttack() {
		try {

			AudioInputStream BallockAttackMusic = AudioSystem
					.getAudioInputStream(new File("C:\\Users\\MYCOM\\Desktop\\พ๎ด๐ลอม๎\\mugic\\ballockattack.wav"));
			ballockAttack = AudioSystem.getClip();
			ballockAttack.open(BallockAttackMusic);
			ballockAttack.start();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void BallockAttackClose() {
		ballockAttack.stop();
	}
}

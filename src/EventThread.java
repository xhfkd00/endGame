import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

public class EventThread extends Thread {
	

	Character Character = new Character(); 

	@Override
	public void run() {
		
		try {
			Thread.sleep(20000);
			System.out.println();
			System.out.println("접속한지 5분이 지났습니다.");
			System.out.println();
			System.out.println("추가 골드 "+Character.eventGold+"골드를 얻습니다.");
			Archer.gold = Archer.gold + Character.eventGold;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
//	public void TEST() throws InterruptedException {
//		while(true) {
//			Thread.sleep(20000);
//			System.out.println();
//			System.out.println("접속한지 5분이 지났습니다.");
//			System.out.println();
//			System.out.println("추가 골드 "+Character.eventGold+"골드를 얻습니다.");
//			Archer.gold = Archer.gold + Character.eventGold;
//		}
//	}
}

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

public class EventThread extends Thread {
	

	Character Character = new Character(); 
	MusicThread MusicThread = new MusicThread();

	@Override
	public void run() {
		
		try {
			Thread.sleep(180000);
			MusicThread.EventGold();
			Thread.sleep(2000);
			MusicThread.EventGoldClose();
			System.out.println();
			System.out.println("�������� 3���� �������ϴ�.");
			System.out.println();
			System.out.println("�߰� ��� "+Character.eventGold+"��带 ����ϴ�.");
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
//			System.out.println("�������� 5���� �������ϴ�.");
//			System.out.println();
//			System.out.println("�߰� ��� "+Character.eventGold+"��带 ����ϴ�.");
//			Archer.gold = Archer.gold + Character.eventGold;
//		}
//	}
}

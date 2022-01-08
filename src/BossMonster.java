import java.util.Scanner;

public class BossMonster extends Monster {

	MusicThread MusicThread = new MusicThread();
	Archer Archer = new Archer();
	
	int swingTail;
	int energyExplosion;
	int maxHitPoint;

	// Ballock
	public BossMonster() {

		hitPoint = 1000;
		strikingPower = 10;
		defensivePower = 0;
		swingTail = strikingPower * 2;
		energyExplosion = strikingPower * 4;
		maxHitPoint = hitPoint;
	}

	// 발록, 꼬리 휘두르기, 에너지 구체 난사,

	@Override
	public void Attack() throws InterruptedException {
		MusicThread.BallockAttack();
		Thread.sleep(3000);
		MusicThread.BallockAttackClose();

		Archer.hitPoint = Archer.hitPoint - (strikingPower - Archer.defensivePower);

		while (Archer.hitPoint > 0) {
			if (Archer.hitPoint > 0) {

				System.out.println();
				System.out.println("발록이 공격했습니다.");
				System.out.println();
				System.out.println("아처의 체력 " + Archer.hitPoint + " / " + Archer.maxHitPoint);
				break;
			}
		}
		if (Archer.hitPoint <= 0) {
			System.out.println("아처가 사망했습니다.");

		}

	}

	public void SwingTail() throws InterruptedException {
		MusicThread.BallockSwingTail();
		Thread.sleep(4000);
		MusicThread.BallockSwingTailClose();

		Archer.hitPoint = Archer.hitPoint - (Archer.defensivePower - swingTail);
		while (Archer.hitPoint > 0) {
			if (Archer.hitPoint > 0) {

				System.out.println();
				System.out.println("발록이 꼬리를 휘둘렀습니다.");
				System.out.println();
				System.out.println("아처의 체력 " + Archer.hitPoint + " / " + Archer.maxHitPoint);
				break;
			}
		}
		if (Archer.hitPoint <= 0) {
			System.out.println("아처가 사망했습니다.");
		}
	}

	public void EnergyExplosion() throws InterruptedException {
		MusicThread.BallockEnergyExplosion();
		Thread.sleep(3000);
		MusicThread.BallockEnergyExplosionClose();
		

		Archer.hitPoint = Archer.hitPoint - (Archer.defensivePower - energyExplosion);

		while (Archer.hitPoint > 0) {
			if (Archer.hitPoint > 0) {

				System.out.println();
				System.out.println("발록이 에너지 구체를 난사합니다.");
				System.out.println();
				System.out.println("아처의 체력 " + Archer.hitPoint + " / " + Archer.maxHitPoint);
				break;
			}
		}
		if (Archer.hitPoint <= 0) {
			System.out.println("아처가 사망했습니다.");
		}
	}
}

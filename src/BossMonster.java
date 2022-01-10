import java.util.Scanner;

public class BossMonster extends Monster {

	MusicThread MusicThread = new MusicThread();
	Archer Archer = new Archer();
	
	int swingTail;
	int energyExplosion;
	int maxHitPoint;

	// Ballock
	public BossMonster() {

		hitPoint = 100000;
		strikingPower = 1000;
		defensivePower = 1000;
		swingTail = strikingPower * 2;
		energyExplosion = strikingPower * 4;
		maxHitPoint = hitPoint;
	}

	// �߷�, ���� �ֵθ���, ������ ��ü ����,

	@Override
	public void Attack() throws InterruptedException {

		MusicThread.BallockAttack();
		Thread.sleep(3000);
		MusicThread.BallockAttackClose();

		Archer.hitPoint = Archer.hitPoint - (strikingPower - Archer.defensivePower);

		while (Archer.hitPoint > 0) {
			if (Archer.hitPoint > 0) {

				System.out.println();
				System.out.println("�߷��� �����߽��ϴ�.");
				System.out.println();
				System.out.println("��ó�� ü�� " + Archer.hitPoint + " / " + Archer.maxHitPoint);
				break;
			}
		}
		if (Archer.hitPoint <= 0) {
			System.out.println();
			System.out.println("��ó�� ����߽��ϴ�.");

		}

	}

	public void SwingTail() throws InterruptedException {
		MusicThread.BallockSwingTail();
		Thread.sleep(4000);
		MusicThread.BallockSwingTailClose();

		Archer.hitPoint = Archer.hitPoint - (swingTail - Archer.defensivePower);
		while (Archer.hitPoint > 0) {
			if (Archer.hitPoint > 0) {

				System.out.println();
				System.out.println("�߷��� ������ �ֵѷ����ϴ�.");
				System.out.println();
				System.out.println("��ó�� ü�� " + Archer.hitPoint + " / " + Archer.maxHitPoint);
				break;
			}
		}
		if (Archer.hitPoint <= 0) {
			System.out.println();
			System.out.println("��ó�� ����߽��ϴ�.");
		}
	}

	public void EnergyExplosion() throws InterruptedException {
		MusicThread.BallockEnergyExplosion();
		Thread.sleep(3000);
		MusicThread.BallockEnergyExplosionClose();
		

		Archer.hitPoint = Archer.hitPoint - (energyExplosion - Archer.defensivePower);

		while (Archer.hitPoint > 0) {
			if (Archer.hitPoint > 0) {

				System.out.println();
				System.out.println("�߷��� ������ ��ü�� �����մϴ�.");
				System.out.println();
				System.out.println("��ó�� ü�� " + Archer.hitPoint + " / " + Archer.maxHitPoint);
				break;
			}
		}
		if (Archer.hitPoint <= 0) {
			System.out.println();
			System.out.println("��ó�� ����߽��ϴ�.");
		}
	}
}

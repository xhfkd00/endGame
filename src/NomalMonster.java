import java.util.*;

public class NomalMonster extends Monster {

//	Random Random = new Random();
//	int monster = Random.nextInt(3) + 1;

	static Archer Archer = new Archer();

	public NomalMonster() {

	}
		

//	public void TripleShot() {
//		hitPoint = NomalMonster.hitPoint - tripleShot;
//		System.out.println("");
//		System.out.println("Ʈ���� ���� ����߽��ϴ�.");
//		System.out.println("������ ü���� " + hitPoint + "���ҽ��ϴ�.");
//
//	}
	int max_hitPoint;
	// ������� Taking down, ���� Rush
	// �ʷϴ����� �Ӽ�
	int greanSnailHitPoint = 400;
	int greanSnailMaxHitPoint = greanSnailHitPoint;
	int greanSnailstrkingPower = 30;
	int greanSnailexperiencePoint = 30;
	int greanSnailGold = 20;
	int greanSnailDefensivePower = 20;
	int greanSnailTakingDown = greanSnailstrkingPower*2;
	int greanSnailRush = greanSnailstrkingPower*3;
	// �Ķ������� �Ӽ�
//	int blueSnailHitPoint = 450;
//	int blueSnailexperiencePoint = 40;
//	int blueSnailstrkingPower = 40;
//	int blueSnailGold = 30;
//	int blueSnailTakingDown = blueSnailstrkingPower*2;
//	int blueSnailRush = blueSnailstrkingPower*3;
	// ���������� �Ӽ�
	int redSnailHitPoint = 2000;
	int redSnailMaxHitPoint = redSnailHitPoint;
	int redSnailexperiencePoint = 500;
	int redSnailstrkingPower = 150;
	int redSnailGold = 1000;
	int redSnailDefensivePower = 50;
	int redSnailTakingDown = redSnailstrkingPower*2;
	int redSnailRush = redSnailstrkingPower*3;

	@Override
	public void Attack() {

		Archer.hitPoint = Archer.hitPoint - this.greanSnailstrkingPower;

		System.out.println();
		System.out.println("���Ͱ� ���� �߽��ϴ�.");
		System.out.println();
		System.out.println("��ó�� ü���� " + Archer.hitPoint + " ���ҽ��ϴ�.");
		System.out.println();

	}

	public void GreanSnail() {
		hitPoint = 400;
		experiencePoint = 30;
		strikingPower = 30;
		gold = 20;
//		System.out.println();
//		System.out.println("�ʷ� �����̸� �������ϴ�.");
	}

//	public void BlueSnail() {
//		hitPoint = 450;
//		experiencePoint = 40;
//		strikingPower = 40;
//		gold = 30;
//
//	}

	public void RedSnail() {
		hitPoint = 2000;
		experiencePoint = 500;
		strikingPower = 150;
		gold = 1000;

	}

	public void NomalMonsterType() {

//		if (monster == 1) {
//			GreanSnail();
////			Archer.hitPoint = Archer.hitPoint - strikingPower;
//			System.out.println();
//			System.out.println("�ʷ� �����̸� �������ϴ�.");
//			System.out.println();
////			System.out.println(Archer.hitPoint);
//		}
//		if (monster == 2) {
//			hitPoint = 450;
//			experiencePoint = 40;
//			strikingPower = 40;
//			gold = 30;
//			System.out.println();
//			System.out.println("�Ķ� �����̸� �������ϴ�.");
//			System.out.println();
////			System.out.println(hitPoint);
//		}
//		if (monster == 3) {
//			hitPoint = 500;
//			experiencePoint = 50;
//			strikingPower = 50;
//			gold = 50;
//			System.out.println();
//			System.out.println("���� �����̸� �������ϴ�.");
//			System.out.println();
////			System.out.println(hitPoint);
//		}
	}

}
//while (NomalMonster.hitPoint > 0) { // ������ hitPoint�� 0�̻��� �� ����
//	NomalMonster.strikingPower = (int)(Math.random()*(60)+30); // ���� ���ݷ� 30~60 ����
//	NomalMonster.hitPoint = NomalMonster.hitPoint - Warrior.strikingPower; // ���� ü���� ���� ���ݷ¿� ����Ͽ� ����
//	Warrior.hitPoint = Warrior.hitPoint - (NomalMonster.strikingPower - Warrior.defensivePower); // ���� ü���� ���� ���ݷ�-���� ���� ����ؼ� ����
//	System.out.println();
//	System.out.println("�Ϲݰ����� �߽��ϴ�.");
//	System.out.println("������ ü���� " + NomalMonster.hitPoint + "���ҽ��ϴ�.");
//	System.out.println();
//	System.out.println("���Ͱ� �ݰ��� �߽��ϴ�");
//	System.out.println("������ ü���� " + Warrior.hitPoint + " ���ҽ��ϴ�.");
//	System.out.println();
//	break;
//}
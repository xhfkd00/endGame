import java.util.Scanner;

public class Archer extends User {

	NomalMonster NomalMonster = new NomalMonster();
	MusicThread MusicThread = new MusicThread();

	int tripleShot;
	int tripleShotMagicpoint;
	int headShot;
	int headShotMagicpoint;
	int stormyPoems;
	int stormyPoemsMagicpoint;
	static int hitPoint;
	static int magicPoint;
	static int maxHitPoint;
	static int maxMagicPoint;
	static int gold;
	static int experiencePoint;
	static int level;
	static int strikingPower;
	static int defensivePower;
	int levelUpHitPoint;
	int levelUpMagicPoint;
	int levelUpStrikingPower;
	int levelUpDefensivePower;
	
	String itemName;

//	static int hitPoint = 5000; // ü��
//	static int magicPoint = 200; // ����
//	static int strikingPower = 50;
////	static int 
//	static int tripleShot; // Ʈ���� �� ���ݷ�
//	static int tripleShotMagicpoint; // Ʈ���� �� ���¼Ҹ�
//	static int headShot; // ��弦 ���ݷ�
//	static int headShotMagicpoint; // ��弦 ���¼Ҹ�
//	static int stormyPoems; // ��ǳ�ǽ� ���ݷ�
//	static int stormyPoemsMagicpoint; // ��ǳ�ǽ� ���¼Ҹ�
//	static int maxHitPoint = hitPoint; 
//	static int maxMagicPoint = magicPoint;
////	static int gold;
////	static int experiencePoint;
//	
//	static int levelUpHitPoint = 100;
//	static int levelUpMagicPoint = 100;
//	static int levelUpStrikingPower = 30;
//	static int levelUpDefensivePower = 10;

	public Archer() {
		level =1;
		gold = 0;
		experiencePoint = 0;
		// Triple Shot, Head Shot, Stormy poems
		hitPoint = 400;
		magicPoint = 200;
		strikingPower = 50;
		defensivePower = 20;
		tripleShot = strikingPower * 3;
		tripleShotMagicpoint = 30;
		headShot = strikingPower * 5;
		headShotMagicpoint = 80;
		stormyPoems = strikingPower * 10;
		stormyPoemsMagicpoint = 150;
		maxHitPoint = hitPoint;
		maxMagicPoint = magicPoint;

		levelUpHitPoint = 50;
		levelUpMagicPoint = 30;
		levelUpStrikingPower = 30;
		levelUpDefensivePower = 10;
//
	}

//	ystem.out.println("���� ���� : " + Warrior.level + " ü�� : " + Warrior.hitPoint + " ���� : " + Warrior.magicPoint + " ����ġ : "
//			+ Warrior.experiencePoint);
//	System.out.println("���ݷ� : " + Warrior.strikingPower + " ���� : " + Warrior.defensivePower + " ������ : " + Warrior.gold);

//	public void ArcherInformation(String name, int level, int hitPoint, int magicPoint, int experiencePoint,
//			int strikingPower, int defensivePower, int gold) {
//		System.out.println(
//				name + " �� ���� ���� : " + level + " ü�� : " + hitPoint + " ���� : " + magicPoint + " ����ġ : " + experiencePoint);
//		System.out.println("���ݷ� : " + strikingPower + " ���� : " + defensivePower + " ������ : " + gold);
//		this.level = level;
//		this.hitPoint = hitPoint;
//		this.magicPoint = magicPoint;
//		this.experiencePoint = experiencePoint;
//		this.strikingPower = strikingPower;
//		this.defensivePower = defensivePower;
//		this.gold = gold;

//	}

	public void ArcherInformation() throws InterruptedException {

		System.out.println("�ü��� ���� : " + level + "  ü�� : " + hitPoint + " / " + maxHitPoint + "  ���� : " + magicPoint
				+ " / " + maxMagicPoint + "  ����ġ : " + experiencePoint);
		Thread.sleep(500);
		System.out.println("���ݷ� : " + strikingPower + "  ���� : " + defensivePower + "  ������ : " + gold);
		System.out.println("������ : "+itemName);
	}

	public String ArcherIntroduction() {
		return "�ü��� ���� ȸ������, ���� ������ Ư¡�Դϴ�";
	}

	// �ʷ� ������ ��� �޼ҵ�
	@Override
	public void Attack() {
		NomalMonster.GreanSnail();

		NomalMonster.greanSnailHitPoint = NomalMonster.greanSnailHitPoint
				- (strikingPower - NomalMonster.greanSnailDefensivePower);
		hitPoint = hitPoint - (NomalMonster.strikingPower - defensivePower);


		while (NomalMonster.greanSnailHitPoint > 0/*&& hitPoint > 0*/) {

			if (NomalMonster.greanSnailHitPoint > 0) {
				System.out.println();
				System.out.println("�Ϲݰ����� �߽��ϴ�.");
				System.out.println();
				System.out.println(
						"�ʷ� �������� ü�� : " + NomalMonster.greanSnailHitPoint + " / " + NomalMonster.greanSnailMaxHitPoint);
				System.out.println();
				System.out.println("���Ͱ� �Ϲݰ��ݸ� �߽��ϴ�.");
				System.out.println();
				System.out.println("��ó�� ü�� : " + hitPoint + " / " + maxHitPoint);
				System.out.println("��ó�� ���� : " + magicPoint + " / " + maxMagicPoint);
				System.out.println();
				System.out.println("----------------------------------------------------------------");
				break;
			}
		}
		if (NomalMonster.greanSnailHitPoint <= 0) {
			NomalMonster.greanSnailHitPoint = NomalMonster.greanSnailMaxHitPoint;
			gold = gold + NomalMonster.greanSnailGold;
			experiencePoint += NomalMonster.greanSnailexperiencePoint;
			System.out.println();
			System.out.println(" ���͸� óġ�߽��ϴ�.");
			System.out.println();
			System.out.println("����ġ + "+NomalMonster.greanSnailexperiencePoint+" , ������ + "+NomalMonster.greanSnailGold+" ȹ���߽��ϴ�.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("ĳ���Ͱ� �׾����ϴ�.");
			System.out.println();
			

		}

	}

	public void TripleShotToGreanSnail() {
		NomalMonster.GreanSnail();

		NomalMonster.greanSnailHitPoint = NomalMonster.greanSnailHitPoint
				- (tripleShot - NomalMonster.greanSnailDefensivePower);
		hitPoint = hitPoint - (NomalMonster.greanSnailTakingDown - defensivePower);
		magicPoint = magicPoint - tripleShotMagicpoint;

		while (NomalMonster.greanSnailHitPoint > 0) {

			if (NomalMonster.greanSnailHitPoint > 0) {

				System.out.println();
				System.out.println("Ʈ���� ���� ����߽��ϴ�.");
				System.out.println();
				System.out.println(
						"�ʷ� �������� ü�� : " + NomalMonster.greanSnailHitPoint + " / " + NomalMonster.greanSnailMaxHitPoint);
				System.out.println();
				System.out.println("���Ͱ� ������⸦ �߽��ϴ�.");
				System.out.println();
				System.out.println("��ó�� ü�� : " + hitPoint + " / " + maxHitPoint);
				System.out.println("��ó�� ���� : " + magicPoint + " / " + maxMagicPoint);
				System.out.println();
				System.out.println("----------------------------------------------------------------");
				break;
			}
		}
		if (NomalMonster.greanSnailHitPoint <= 0) {
			NomalMonster.greanSnailHitPoint = NomalMonster.greanSnailMaxHitPoint;
			gold = gold + NomalMonster.greanSnailGold;
			experiencePoint += NomalMonster.greanSnailexperiencePoint;
			System.out.println();
			System.out.println(" ���͸� óġ�߽��ϴ�.");
			System.out.println();
			System.out.println("����ġ + "+NomalMonster.greanSnailexperiencePoint+" , ������ + "+NomalMonster.greanSnailGold+" ȹ���߽��ϴ�.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("ĳ���Ͱ� �׾����ϴ�.");
			System.out.println();

		}

	}

	public void HeadShotToGreanSnail() {
		NomalMonster.GreanSnail();

		NomalMonster.greanSnailHitPoint = NomalMonster.greanSnailHitPoint
				- (headShot - NomalMonster.greanSnailDefensivePower);
		hitPoint = hitPoint - (NomalMonster.greanSnailRush - defensivePower);
		magicPoint = magicPoint - headShotMagicpoint;

		while (NomalMonster.greanSnailHitPoint >= 0) {

			if (NomalMonster.greanSnailHitPoint > 0) {

				System.out.println();
				System.out.println("��� ���� ����߽��ϴ�.");
				System.out.println();
				System.out.println(
						"�ʷ� �������� ü�� : " + NomalMonster.greanSnailHitPoint + " / " + NomalMonster.greanSnailMaxHitPoint);
				System.out.println();
				System.out.println("���Ͱ� ������⸦ �߽��ϴ�.");
				System.out.println();
				System.out.println("��ó�� ü�� : " + hitPoint + " / " + maxHitPoint);
				System.out.println("��ó�� ���� : " + magicPoint + " / " + maxMagicPoint);
				System.out.println();
				System.out.println("----------------------------------------------------------------");
				break;
			}
		}
		if (NomalMonster.greanSnailHitPoint <= 0) {
			NomalMonster.greanSnailHitPoint = NomalMonster.greanSnailMaxHitPoint;
			gold = gold + NomalMonster.greanSnailGold;
			experiencePoint += NomalMonster.greanSnailexperiencePoint;
			System.out.println();
			System.out.println(" ���͸� óġ�߽��ϴ�.");
			System.out.println();
			System.out.println("����ġ + "+NomalMonster.greanSnailexperiencePoint+" , ������ + "+NomalMonster.greanSnailGold+" ȹ���߽��ϴ�.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("ĳ���Ͱ� �׾����ϴ�.");
			System.out.println();

		}

	}

	public void StormyPoemsToGreanSnail() {
		NomalMonster.GreanSnail();

		NomalMonster.greanSnailHitPoint = NomalMonster.greanSnailHitPoint
				- (stormyPoems - NomalMonster.greanSnailDefensivePower);
		hitPoint = hitPoint - (NomalMonster.greanSnailRush - defensivePower);
		magicPoint = magicPoint - stormyPoemsMagicpoint;

		while (NomalMonster.greanSnailHitPoint >= 0) {

			if (NomalMonster.greanSnailHitPoint > 0) {

				System.out.println();
				System.out.println("��ǳ�� �ø� ����߽��ϴ�.");
				System.out.println();
				System.out.println(
						"�ʷ� �������� ü�� : " + NomalMonster.greanSnailHitPoint + " / " + NomalMonster.greanSnailMaxHitPoint);
				System.out.println();
				System.out.println("���Ͱ� ������⸦ �߽��ϴ�.");
				System.out.println();
				System.out.println("��ó�� ü�� : " + hitPoint + " / " + maxHitPoint);
				System.out.println("��ó�� ���� : " + magicPoint + " / " + maxMagicPoint);
				System.out.println();
				System.out.println("----------------------------------------------------------------");
				break;
			}
		}
		if (NomalMonster.greanSnailHitPoint <= 0) {
			NomalMonster.greanSnailHitPoint = NomalMonster.greanSnailMaxHitPoint;
			gold = gold + NomalMonster.greanSnailGold;
			experiencePoint += NomalMonster.greanSnailexperiencePoint;
			System.out.println();
			System.out.println(" ���͸� óġ�߽��ϴ�.");
			System.out.println();
			System.out.println("����ġ + "+NomalMonster.greanSnailexperiencePoint+" , ������ + "+NomalMonster.greanSnailGold+" ȹ���߽��ϴ�.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("ĳ���Ͱ� �׾����ϴ�.");
			System.out.println();

		}

	}

	// ���� ������ ��� �޼ҵ�
	public void AttackToRedSnail() {
		NomalMonster.RedSnail();

		NomalMonster.redSnailHitPoint = NomalMonster.redSnailHitPoint
				- (strikingPower - NomalMonster.redSnailDefensivePower);
		hitPoint = hitPoint - (NomalMonster.strikingPower - defensivePower);

		while (NomalMonster.redSnailHitPoint > 0) {

			if (NomalMonster.redSnailHitPoint > 0) {
				System.out.println();
				System.out.println("�Ϲݰ����� �߽��ϴ�.");
//				System.out.println();
				System.out.println(
						"���� �������� ü�� : " + NomalMonster.redSnailHitPoint + " / " + NomalMonster.redSnailMaxHitPoint);
				System.out.println();
				System.out.println("���Ͱ� �Ϲݰ��ݸ� �߽��ϴ�.");
//				System.out.println();
				System.out.println("��ó�� ü�� : " + hitPoint + " / " + maxHitPoint);
				System.out.println("��ó�� ���� : " + magicPoint + " / " + maxMagicPoint);
				System.out.println();
				System.out.println("----------------------------------------------------------------");
				break;
			}
		}
		if (NomalMonster.redSnailHitPoint <= 0) {
			NomalMonster.redSnailHitPoint = NomalMonster.redSnailMaxHitPoint;
			gold = gold + NomalMonster.redSnailGold;
			experiencePoint += NomalMonster.redSnailexperiencePoint;
			System.out.println();
			System.out.println(" ���͸� óġ�߽��ϴ�.");
			System.out.println();
			System.out.println("����ġ + "+NomalMonster.redSnailexperiencePoint+" , ������ + "+NomalMonster.redSnailGold+" ȹ���߽��ϴ�.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("ĳ���Ͱ� �׾����ϴ�.");
			System.out.println();

		}

	}

	public void TripleShotToRedSnail() {
		NomalMonster.RedSnail();

		NomalMonster.redSnailHitPoint = NomalMonster.redSnailHitPoint
				- (tripleShot - NomalMonster.redSnailDefensivePower);
		hitPoint = hitPoint - (NomalMonster.redSnailRush - defensivePower);
		magicPoint = magicPoint - tripleShotMagicpoint;

		while (NomalMonster.redSnailHitPoint >= 0) {

			if (NomalMonster.redSnailHitPoint > 0) {

				System.out.println();
				System.out.println("��ǳ�� �ø� ����߽��ϴ�.");
				System.out.println();
				System.out.println(
						"�ʷ� �������� ü�� : " + NomalMonster.redSnailHitPoint + " / " + NomalMonster.redSnailMaxHitPoint);
				System.out.println();
				System.out.println("���Ͱ� ������⸦ �߽��ϴ�.");
				System.out.println();
				System.out.println("��ó�� ü�� : " + hitPoint + " / " + maxHitPoint);
				System.out.println("��ó�� ���� : " + magicPoint + " / " + maxMagicPoint);
				System.out.println();
				System.out.println("----------------------------------------------------------------");
				break;
			}
		}
		if (NomalMonster.redSnailHitPoint <= 0) {
			NomalMonster.redSnailHitPoint = NomalMonster.redSnailMaxHitPoint;
			gold = gold + NomalMonster.redSnailGold;
			experiencePoint += NomalMonster.redSnailexperiencePoint;
			System.out.println();
			System.out.println(" ���͸� óġ�߽��ϴ�.");
			System.out.println();
			System.out.println("����ġ + "+NomalMonster.redSnailexperiencePoint+" , ������ + "+NomalMonster.redSnailGold+" ȹ���߽��ϴ�.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("ĳ���Ͱ� �׾����ϴ�.");
			System.out.println();

		}
	}

	public void HeadShotToRedSnail() {
		NomalMonster.RedSnail();

		NomalMonster.redSnailHitPoint = NomalMonster.redSnailHitPoint
				- (headShot - NomalMonster.redSnailDefensivePower);
		hitPoint = hitPoint - NomalMonster.redSnailRush;
		magicPoint = magicPoint - headShotMagicpoint;

		while (NomalMonster.redSnailHitPoint >= 0) {

			if (NomalMonster.redSnailHitPoint > 0) {

				System.out.println();
				System.out.println("��ǳ�� �ø� ����߽��ϴ�.");
				System.out.println();
				System.out.println(
						"�ʷ� �������� ü�� : " + NomalMonster.redSnailHitPoint + " / " + NomalMonster.redSnailMaxHitPoint);
				System.out.println();
				System.out.println("���Ͱ� ������⸦ �߽��ϴ�.");
				System.out.println();
				System.out.println("��ó�� ü�� : " + hitPoint + " / " + maxHitPoint);
				System.out.println("��ó�� ���� : " + magicPoint + " / " + maxMagicPoint);
				System.out.println();
				System.out.println("----------------------------------------------------------------");
				break;
			}
		}
		if (NomalMonster.redSnailHitPoint <= 0) {
			NomalMonster.redSnailHitPoint = NomalMonster.redSnailMaxHitPoint;
			gold = gold + NomalMonster.redSnailGold;
			experiencePoint += NomalMonster.redSnailexperiencePoint;
			System.out.println();
			System.out.println(" ���͸� óġ�߽��ϴ�.");
			System.out.println();
			System.out.println("����ġ + "+NomalMonster.redSnailexperiencePoint+" , ������ + "+NomalMonster.redSnailGold+" ȹ���߽��ϴ�.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("ĳ���Ͱ� �׾����ϴ�.");
			System.out.println();

		}
	}

	public void StormyPoemsToRedSnail() {
		NomalMonster.RedSnail();

		NomalMonster.redSnailHitPoint = NomalMonster.redSnailHitPoint
				- (stormyPoems - NomalMonster.redSnailDefensivePower);
		hitPoint = hitPoint - (NomalMonster.redSnailRush - defensivePower);
		magicPoint = magicPoint - stormyPoemsMagicpoint;

		while (NomalMonster.redSnailHitPoint >= 0) {

			if (NomalMonster.redSnailHitPoint > 0) {

				System.out.println();
				System.out.println("��ǳ�� �ø� ����߽��ϴ�.");
				System.out.println();
				System.out.println(
						"�ʷ� �������� ü�� : " + NomalMonster.redSnailHitPoint + " / " + NomalMonster.redSnailMaxHitPoint);
				System.out.println();
				System.out.println("���Ͱ� ������⸦ �߽��ϴ�.");
				System.out.println();
				System.out.println("��ó�� ü�� : " + hitPoint + " / " + maxHitPoint);
				System.out.println("��ó�� ���� : " + magicPoint + " / " + maxMagicPoint);
				System.out.println();
				System.out.println("----------------------------------------------------------------");
				break;
			}
		}
		if (NomalMonster.redSnailHitPoint <= 0) {
			NomalMonster.redSnailHitPoint = NomalMonster.redSnailMaxHitPoint;
			gold = gold + NomalMonster.redSnailGold;
			experiencePoint += NomalMonster.redSnailexperiencePoint;
			System.out.println();
			System.out.println(" ���͸� óġ�߽��ϴ�.");
			System.out.println();
			System.out.println("����ġ + "+NomalMonster.redSnailexperiencePoint+" , ������ + "+NomalMonster.redSnailGold+" ȹ���߽��ϴ�.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("ĳ���Ͱ� �׾����ϴ�.");
			System.out.println();

		}
	}

	static BossMonster BossMonster = new BossMonster();
	// �������� ���
	public void AttackToBossMonster() throws InterruptedException {
		int attackPower = strikingPower -BossMonster.defensivePower;

		if (strikingPower -BossMonster.defensivePower < 0) {
			attackPower = 0;
		}
		BossMonster.hitPoint = BossMonster.hitPoint - attackPower;
		
		while (BossMonster.hitPoint > 0) {

			if (BossMonster.hitPoint > 0) {

				System.out.println();
				System.out.println("�߷��� �����߽��ϴ�.");
				System.out.println();
				System.out.println("�߷��� ü���� " + BossMonster.hitPoint + " / " + BossMonster.maxHitPoint);
				break;
			}

		}
		if ( BossMonster.hitPoint <= 0) {
			MusicThread.Done();
			System.out.println();
			System.out.println("�߷��� óġ�߽��ϴ�!");
			System.out.println();
			System.out.println("�߷�óġ�ϱ� ����!!!!!!!!!");
			Thread.sleep(30000);
			MusicThread.DoneClose();
			
			System.exit(0);
		}
	}
	public void TripleShotToBallock() throws InterruptedException {
		int attackPower = tripleShot -BossMonster.defensivePower;

		if (tripleShot -BossMonster.defensivePower < 0) {
			attackPower = 0;
		}
		BossMonster.hitPoint = BossMonster.hitPoint - attackPower;
		magicPoint = magicPoint - tripleShotMagicpoint;
		
		while (BossMonster.hitPoint > 0) {

			if (BossMonster.hitPoint > 0) {

				System.out.println();
				System.out.println("Ʈ���� ���� ����߽��ϴ�.");
				System.out.println();
				System.out.println("�߷��� ü�� " + BossMonster.hitPoint + " / "+ BossMonster.maxHitPoint);
				break;
			}

		}
		if ( BossMonster.hitPoint <= 0) {
			MusicThread.Done();
			System.out.println();
			System.out.println("�߷��� óġ�߽��ϴ�!");
			System.out.println();
			System.out.println("�߷�óġ�ϱ� ����!!!!!!!!!");
			Thread.sleep(30000);
			MusicThread.DoneClose();
			
			System.exit(0);
		}
	}
	
	public void HeadShotToBallock() throws InterruptedException {
		int attackPower = headShot -BossMonster.defensivePower;

		if (headShot -BossMonster.defensivePower < 0) {
			attackPower = 0;
		}
		BossMonster.hitPoint = BossMonster.hitPoint - attackPower;
		magicPoint = magicPoint - headShotMagicpoint;
		while (BossMonster.hitPoint > 0) {

			if (BossMonster.hitPoint > 0) {

				System.out.println();
				System.out.println("��� ���� ����߽��ϴ�.");
				System.out.println();
				System.out.println("�߷��� ü�� " + BossMonster.hitPoint + " / "+ BossMonster.maxHitPoint);
				break;
			}

		}
		if ( BossMonster.hitPoint <= 0) {

			MusicThread.Done();
			System.out.println();
			System.out.println("�߷��� óġ�߽��ϴ�!");
			System.out.println();
			System.out.println("�߷�óġ�ϱ� ����!!!!!!!!!");
			Thread.sleep(30000);
			MusicThread.DoneClose();
			
			System.exit(0);
		}
	}
	
	public void StormyPoemsToBallock() throws InterruptedException {
		int attackPower = stormyPoems -BossMonster.defensivePower;

		if (stormyPoems -BossMonster.defensivePower < 0) {
			attackPower = 0;
		}
		BossMonster.hitPoint = BossMonster.hitPoint - attackPower;
		magicPoint = magicPoint - stormyPoemsMagicpoint;
		while (BossMonster.hitPoint > 0) {

			if (BossMonster.hitPoint > 0) {

				System.out.println();
				System.out.println("��ǳ�� �ø� ����߽��ϴ�.");
				System.out.println();
				System.out.println("�߷��� ü�� " + BossMonster.hitPoint + " / " + BossMonster.maxHitPoint);
				break;
			}

		}
		if ( BossMonster.hitPoint <= 0) {
			MusicThread.Done();
			System.out.println();
			System.out.println("�߷��� óġ�߽��ϴ�!");
			System.out.println();
			System.out.println("�߷�óġ�ϱ� ����!!!!!!!!!");
			Thread.sleep(30000);
			MusicThread.DoneClose();
			
			System.exit(0);
		}
	}

	public void Behavior() {
		System.out.println();
		System.out.println("�ൿ�� ������ �ּ���.");
		System.out.println();
		System.out.println("1. �Ϲݰ���  2. Ʈ���� ��  3. ��� ��  4. ��ǳ�� ��  5. ���ư���");
		System.out.print(" -> ");
	}

	public void ArcherLevelUp() {
		System.out.println();
		System.out.println("������!!!!!!!!!!");
		System.out.println();
		System.out.println("�ִ� ü���� " + levelUpHitPoint + ", �ִ� ������ " + levelUpMagicPoint);
		System.out.println("���ݷ��� " + levelUpStrikingPower + ", ������ " + levelUpDefensivePower + " �ö����ϴ�.");
		hitPoint = hitPoint + levelUpHitPoint;
		magicPoint += levelUpMagicPoint;
		this.strikingPower += levelUpStrikingPower;
		this.defensivePower += levelUpDefensivePower;
		level = level + 1;
		this.experiencePoint -= levelUpPoint;
		System.out.println("��ó ü�� : " + hitPoint);
		System.out.println("��ó ���� : " + magicPoint);
		System.out.println("��ó ���ݷ� : " + strikingPower);
		System.out.println("��ó ���� : " + defensivePower);
		System.out.println("��ó ���� : " + level);
	}

}

import java.util.Scanner;

public class Map {

	Character Character = new Character();
	NomalMonster NomalMonster = new NomalMonster();
	BossMonster BossMonster = new BossMonster();
	Archer Archer = new Archer();
	User User = new User();
	Scanner scanner = new Scanner(System.in);
	//�����ǻ�, �Ϲݴ���, ��������
//	change(Archer);
	public Map(){
		
		
	}
	
	@SuppressWarnings("static-access")
	public void MapLifeWell() {
//		Archer Archer = new Archer();

		System.out.println();
		System.out.println("������ ������ �̵��ϼ̽��ϴ�.");
		System.out.println();
		System.out.println("ü�°� ������ ��� ȸ���Ǿ����ϴ�.");
		System.out.println();
		Archer.hitPoint = Archer.maxHitPoint;
		Archer.magicPoint = Archer.maxMagicPoint;
//		System.out.println("��ó ��Ʈ����Ʈ : "+Archer.hitPoint);
//		System.out.println("��ó �ƽ� ��Ʈ����Ʈ : "+Archer.maxHitPoint);
//		System.out.println("��ó ��������Ʈ : " +Archer.magicPoint);
//		System.out.println("��ó �ƽ� ��������Ʈ : "+Archer.maxMagicPoint);
		
	}
//	public int Test111(int hitPoint) {
//		
//		System.out.println("ü�� : "+hitPoint);
//		System.out.println(" ü,�� �� á�� ��� ����");
//		return hitPoint = Archer.maxHitPoint;
//		
//	}
	
	public void NomalMonsterHunting() {
		System.out.println();
		System.out.println("�Ϲ� ���� ����ͷ� �̵��ϼ̽��ϴ�.");
		System.out.println();
	}
	public void NoMalMonsterType() {
		System.out.println();
		System.out.println("1. �ʷ� ������  2. ���� ������");
		System.out.print(" - > ");
	}
	public void LevelUpHall() {
		System.out.println();
		System.out.println("�������� �������� �̵��߽��ϴ�.");
		System.out.println();
		System.out.println("�������� �ʿ� ����ġ�� "+Character.levelUpPoint+" �Դϴ�.");
		System.out.println();
		
	}
	public void ArcherLevelUp() {
//		Archer Archer = new Archer();
//		Archer.hitPoint = Archer.hitPoint + Archer.levelUpHitPoint;
//		Archer.magicPoint += Archer.levelUpMagicPoint;
//		Archer.strikingPower += Archer.levelUpStrikingPower;
//		Archer.defensivePower += Archer.levelUpDefensivePower;
//		Archer.level = Archer.level + 1;
//		Archer.experiencePoint -= Character.levelUpPoint;
		System.out.println();
		System.out.println("������!!!!!!!!!!");
		System.out.println();
		System.out.println("�ִ� ü���� " + Archer.levelUpHitPoint +", �ִ� ������ "+Archer.levelUpMagicPoint);
		System.out.println("���ݷ��� "+Archer.levelUpStrikingPower +", ������ "+Archer.levelUpDefensivePower+" �ö����ϴ�.");
		System.out.println();
//		System.out.println("��ó ü�� : "+Archer.hitPoint);
//		System.out.println("��ó ���� : "+Archer.magicPoint);
//		System.out.println("��ó ���ݷ� : "+Archer.strikingPower);
//		System.out.println("��ó ���� : "+Archer.defensivePower);
//		System.out.println("��ó ���� : " +Archer.level);
	}
	
	public void ArcherItem() {
		System.out.println();
		System.out.println("������ �������� �̵��߽��ϴ�.");
		System.out.println();
		System.out.println("1. �� Ȱ   2. ȭ���� Ȱ   3. �Ǹ��� Ȱ   4. ���ư���");
		System.out.print(" -> ");
	}
	
	@SuppressWarnings("static-access")
	public void leveruptest() {
		System.out.println();
		System.out.println("1. ������  2. ���ư���");
		System.out.print(" -> ");
		int levelUp = scanner.nextInt();
		if (Archer.experiencePoint >= Character.levelUpPoint) { // ������
//			Map.ArcherLevelUp();
			Archer.maxHitPoint = Archer.hitPoint + Archer.levelUpHitPoint;
			Archer.maxMagicPoint += Archer.levelUpMagicPoint;
			Archer.strikingPower += Archer.levelUpStrikingPower;
			Archer.defensivePower += Archer.levelUpDefensivePower;
			Archer.level = Archer.level + 1;
			Archer.experiencePoint -= Character.levelUpPoint;

		} else if (levelUp == 2) { // ���ư���
//			break;
		} else if (Character.experiencePoint < 100) {
			System.out.println("����ġ�� �����մϴ�.");
			System.out.println();

		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println();
//			break;
		}
	}

}
//levelUpHitPoint = 50;
//levelUpmagicPoint = 30;
//levelUpStrikingPower = 30;
//levelUpDefensivePower = 10;

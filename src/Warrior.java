
public class Warrior extends User {

	int skill = this.strikingPower * 2; // ��������
	int skill_magicPoint = 10; // ��������
	int max_hitPoint; // ���� �ִ�ü��
	int max_magicPoint; // ���� �ִ븶��
	int finalAttack; // ���� ��ų "���̳� ����"
	int finalAttackMagicpoint = 30; // ���� ��ų "���̳� ����" ���� MP ���ҷ�
	int dragonRoar; // ���� ��ų "�巡�� �ξ�"
	int dragonRoarMagicpoint = 50; // ���� ��ų "�巡�� �ξ�" ���� MP ���ҷ�
	int upHammer; // ���罺ų "�� �ظ�"
	int upHammerMagicpoint = 300; // ���� ��ų "�� �ظ�" ���� MP ���ҷ�, �ʻ��

	NomalMonster NomalMonster = new NomalMonster();

	public Warrior() {
		hitPoint = 600;
		magicPoint = 100;
		strikingPower = 50;
		defensivePower = 30;
		max_hitPoint = hitPoint;
		max_magicPoint = magicPoint;
		this.finalAttack = strikingPower * 3;
		this.dragonRoar = strikingPower * 5;
		this.upHammer = strikingPower * 10;

	}

	public Warrior(int level, int hitPoint, int magicPoint, int strikingPower, int defensivePower, int gold) {
		level = level;
		hitPoint = hitPoint;
		magicPoint = magicPoint;
		strikingPower = strikingPower;
		defensivePower = defensivePower;
		gold = gold;
	}

	public String Warrior_info() {
		return "����� �������ݰ� ���� ������ Ư¡�Դϴ�";
	}

	public void Warrior_Attack() {
		System.out.println("�Ϲݰ����� �߽��ϴ�");
		System.out.print("������ ü���� ");
		System.out.print(NomalMonster.hitPoint - this.strikingPower);
		System.out.print(" / ");
		System.out.print(NomalMonster.hitPoint);
		System.out.println(" ���ҽ��ϴ�.");
	}

	public int Warrior_skill() {
		return NomalMonster.hitPoint - skill;
	}

	public void FinalAttack() {
		hitPoint = NomalMonster.hitPoint - this.finalAttack;
		System.out.println("������ ü����" + hitPoint + "���ҽ��ϴ�");
		magicPoint = this.magicPoint - finalAttackMagicpoint;
		System.out.println("������ " + magicPoint + "���ҽ��ϴ�");
	}
	
	public void DragonRoar() {
		hitPoint = NomalMonster.hitPoint - this.dragonRoar;
		System.out.println("������ ü���� "+ hitPoint +"���ҽ��ϴ�");
		magicPoint = this.magicPoint - dragonRoarMagicpoint;
		System.out.println("������ " + magicPoint + "���ҽ��ϴ�");
	}
	
	public void UpHammer() {
		hitPoint = NomalMonster.hitPoint - this.upHammer;
		System.out.println("������ ü���� "+ hitPoint +" ���ҽ��ϴ�.");
		magicPoint = this.magicPoint - upHammerMagicpoint;
		System.out.println("������ " + magicPoint + " ���ҽ��ϴ�.");
	}

}

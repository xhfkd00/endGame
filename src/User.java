import java.util.*;

public class User extends Character {

	Scanner scanner = new Scanner(System.in);

	public User() {

	}

	// ���� ������
	int silevelerSwordAttackPower = 30;
	int silevelerSwordPrice = 100;
	int deathBladeAttackPower = 100;
	int deathBladePrice = 300;
	int lighteningSwordAttackPower = 300;
	int lighteningSwordPrice = 500;
	int devilKingsSwordAttackPower = 500;
	int devilKingsSwordPrice = 1000;
	int ancientSwordAttackPower = 1500;
	int ancientSwordPrice = 3000;
	int executionSwordAttackPower = 5000;
	int executionSwordPrice = 10000;

	public void User_Item_dagger(String name, int daggerAttackPower, int daggerPrice) {
		System.out.println(name + " �� ���ݷ���" + daggerAttackPower + "�̰�, ������ " + daggerPrice + " �Դϴ�.");
	}

	public void User_Item_woodenShied(String name, int woodenShied, int woodenShiedPrice) {
		System.out.println(name + " �� ������ " + woodenShied + " �̰�, ������ " + woodenShiedPrice + " �Դϴ�");
	}

	public void Warrior_Item_Sileveler_Sword() {
		System.out.println("'�����'�� ���ݷ��� " + silevelerSwordAttackPower + " �̰�, ������ " + silevelerSwordPrice + " �Դϴ�");
	}

	public void Warrior_Item_Death_Blade() {
		System.out.println("'���� ���̵�'�� ���ݷ��� " + deathBladeAttackPower + " �̰�, ������ " + deathBladePrice + " �Դϴ�");
	}

	public void Warrior_Item_Lightening_Sword() {
		System.out.println("'���Ű�'�� ���ݷ��� " + lighteningSwordAttackPower + " �̰�, ������ " + lighteningSwordPrice + " �Դϴ�");
	}

	public void Warrior_Item_DevilKings_Sword() {
		System.out
				.println("'�Ǹ����� ��'�� ���ݷ��� " + devilKingsSwordAttackPower + " �̰�, ������ " + devilKingsSwordPrice + " �Դϴ�");
	}

	public void Warrior_Item_Ancient_Sword() {
		System.out.println("'��� ���� ��'�� ���ݷ��� " + ancientSwordAttackPower + " �̰�, ������ " + ancientSwordPrice + " �Դϴ�");
	}

	public void Warrior_Item_Execution_Sword() {
		System.out.println("'�����'�� ���ݷ��� " + executionSwordAttackPower + " �̰�, ������ " + executionSwordPrice + " �Դϴ�");
	}

	public void AttackBuff() {
		System.out.println("���ݷ� ���� ������ ����߽��ϴ�.");

	}

	public void defensivePowerBuff() {
		System.out.println("���� ���� ������ ����߽��ϴ�.");
	}

	// �ü� ������

	String silverBow = "�� Ȱ";
	int silverBowAttackPower = 150;
	int silverBowPrice = 500;
	String fireBow = "ȭ���� Ȱ";
	int fireBowAttackPower = 300;
	int fireBowPrice = 1300;
	String nightmareBow = "�Ǹ��� Ȱ";
	int nightmareBowAttackPower = 5000;
	int nightmareBowPrice = 10000;

	static Archer Archer = new Archer();

	public void SilverBow() {
		System.out.println();
		System.out.println(silverBow + "�� ���ݷ� : " + silverBowAttackPower + " ���� : " + silevelerSwordPrice);
		System.out.println();
		System.out.println("���� �Ͻðڽ��ϱ�?");
		System.out.println("1. ����   2. ���ư���");
		System.out.print(" -> ");
//		int purchase = scanner.nextInt();
//		if (purchase == 1) {
//			System.out.println();
//			System.out.println(silverBow + " �� �����ϼ̽��ϴ�.");
//			System.out.println();
//			System.out.println("���ݷ��� " + silevelerSwordAttackPower + " �ö����ϴ�.");
//			System.out.println();
//			Archer.itemName = this.silverBow;
//			Archer.strikingPower += silevelerSwordAttackPower;
//
//		}
//		else if (purchase == 2) {
//			System.out.println();
//			System.out.println("���ư��⸦ �Է��ϼ̽��ϴ�.");
//		} else {
//			System.out.println();
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.11");
//			System.out.println();
//		}
	}

	public void FireBow() {
		System.out.println();
		System.out.println(fireBow + "�� ���ݷ� : " + fireBowAttackPower + " ���� : " + fireBowPrice);
		System.out.println();
		System.out.println("���� �Ͻðڽ��ϱ�?");
		System.out.println("1. ����   2. ���ư���");
		System.out.print(" -> ");
	}

	public void NightmareBow() {
		System.out.println();
		System.out.println(nightmareBow + "�� ���ݷ� : " + nightmareBowAttackPower + " ���� : " + nightmareBowPrice);
		System.out.println();
		System.out.println("���� �Ͻðڽ��ϱ�?");
		System.out.println("1. ����   2. ���ư���");
		System.out.print(" -> ");
	}

}

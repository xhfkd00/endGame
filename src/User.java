import java.util.*;

public class User extends Character {

	Scanner scanner = new Scanner(System.in);

	public User() {

	}

	// 전사 아이템
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
		System.out.println(name + " 의 공격력은" + daggerAttackPower + "이고, 가격은 " + daggerPrice + " 입니다.");
	}

	public void User_Item_woodenShied(String name, int woodenShied, int woodenShiedPrice) {
		System.out.println(name + " 의 가격은 " + woodenShied + " 이고, 가격은 " + woodenShiedPrice + " 입니다");
	}

	public void Warrior_Item_Sileveler_Sword() {
		System.out.println("'은장검'의 공격력은 " + silevelerSwordAttackPower + " 이고, 가격은 " + silevelerSwordPrice + " 입니다");
	}

	public void Warrior_Item_Death_Blade() {
		System.out.println("'데스 블레이드'의 공격력은 " + deathBladeAttackPower + " 이고, 가격은 " + deathBladePrice + " 입니다");
	}

	public void Warrior_Item_Lightening_Sword() {
		System.out.println("'뇌신검'의 공격력은 " + lighteningSwordAttackPower + " 이고, 가격은 " + lighteningSwordPrice + " 입니다");
	}

	public void Warrior_Item_DevilKings_Sword() {
		System.out
				.println("'악마왕의 검'의 공격력은 " + devilKingsSwordAttackPower + " 이고, 가격은 " + devilKingsSwordPrice + " 입니다");
	}

	public void Warrior_Item_Ancient_Sword() {
		System.out.println("'고대 신의 검'의 공격력은 " + ancientSwordAttackPower + " 이고, 가격은 " + ancientSwordPrice + " 입니다");
	}

	public void Warrior_Item_Execution_Sword() {
		System.out.println("'집행검'의 공격력은 " + executionSwordAttackPower + " 이고, 가격은 " + executionSwordPrice + " 입니다");
	}

	public void AttackBuff() {
		System.out.println("공격력 증가 버프를 사용했습니다.");

	}

	public void defensivePowerBuff() {
		System.out.println("방어력 증가 버프를 사용했습니다.");
	}

	// 궁수 아이템

	String silverBow = "은 활";
	int silverBowAttackPower = 150;
	int silverBowPrice = 500;
	String fireBow = "화염의 활";
	int fireBowAttackPower = 300;
	int fireBowPrice = 1300;
	String nightmareBow = "악몽의 활";
	int nightmareBowAttackPower = 5000;
	int nightmareBowPrice = 10000;

	static Archer Archer = new Archer();

	public void SilverBow() {
		System.out.println();
		System.out.println(silverBow + "의 공격력 : " + silverBowAttackPower + " 가격 : " + silevelerSwordPrice);
		System.out.println();
		System.out.println("구매 하시겠습니까?");
		System.out.println("1. 구매   2. 돌아가기");
		System.out.print(" -> ");
//		int purchase = scanner.nextInt();
//		if (purchase == 1) {
//			System.out.println();
//			System.out.println(silverBow + " 를 구매하셨습니다.");
//			System.out.println();
//			System.out.println("공격력이 " + silevelerSwordAttackPower + " 올랐습니다.");
//			System.out.println();
//			Archer.itemName = this.silverBow;
//			Archer.strikingPower += silevelerSwordAttackPower;
//
//		}
//		else if (purchase == 2) {
//			System.out.println();
//			System.out.println("돌아가기를 입력하셨습니다.");
//		} else {
//			System.out.println();
//			System.out.println("잘못 입력하셨습니다.11");
//			System.out.println();
//		}
	}

	public void FireBow() {
		System.out.println();
		System.out.println(fireBow + "의 공격력 : " + fireBowAttackPower + " 가격 : " + fireBowPrice);
		System.out.println();
		System.out.println("구매 하시겠습니까?");
		System.out.println("1. 구매   2. 돌아가기");
		System.out.print(" -> ");
	}

	public void NightmareBow() {
		System.out.println();
		System.out.println(nightmareBow + "의 공격력 : " + nightmareBowAttackPower + " 가격 : " + nightmareBowPrice);
		System.out.println();
		System.out.println("구매 하시겠습니까?");
		System.out.println("1. 구매   2. 돌아가기");
		System.out.print(" -> ");
	}

}

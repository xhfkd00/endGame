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
//		System.out.println("트리플 샷을 사용했습니다.");
//		System.out.println("몬스터의 체력이 " + hitPoint + "남았습니다.");
//
//	}
	int max_hitPoint;
	// 내려찍기 Taking down, 돌진 Rush
	// 초록달팽이 속성
	int greanSnailHitPoint = 400;
	int greanSnailMaxHitPoint = greanSnailHitPoint;
	int greanSnailstrkingPower = 30;
	int greanSnailexperiencePoint = 30;
	int greanSnailGold = 20;
	int greanSnailDefensivePower = 20;
	int greanSnailTakingDown = greanSnailstrkingPower*2;
	int greanSnailRush = greanSnailstrkingPower*3;
	// 파란달팽이 속성
//	int blueSnailHitPoint = 450;
//	int blueSnailexperiencePoint = 40;
//	int blueSnailstrkingPower = 40;
//	int blueSnailGold = 30;
//	int blueSnailTakingDown = blueSnailstrkingPower*2;
//	int blueSnailRush = blueSnailstrkingPower*3;
	// 빨간달팽이 속성
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
		System.out.println("몬스터가 공격 했습니다.");
		System.out.println();
		System.out.println("아처의 체력이 " + Archer.hitPoint + " 남았습니다.");
		System.out.println();

	}

	public void GreanSnail() {
		hitPoint = 400;
		experiencePoint = 30;
		strikingPower = 30;
		gold = 20;
//		System.out.println();
//		System.out.println("초록 달팽이를 만났습니다.");
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
//			System.out.println("초록 달팽이를 만났습니다.");
//			System.out.println();
////			System.out.println(Archer.hitPoint);
//		}
//		if (monster == 2) {
//			hitPoint = 450;
//			experiencePoint = 40;
//			strikingPower = 40;
//			gold = 30;
//			System.out.println();
//			System.out.println("파란 달팽이를 만났습니다.");
//			System.out.println();
////			System.out.println(hitPoint);
//		}
//		if (monster == 3) {
//			hitPoint = 500;
//			experiencePoint = 50;
//			strikingPower = 50;
//			gold = 50;
//			System.out.println();
//			System.out.println("빨간 달팽이를 만났습니다.");
//			System.out.println();
////			System.out.println(hitPoint);
//		}
	}

}
//while (NomalMonster.hitPoint > 0) { // 몬스터의 hitPoint가 0이상일 때 실행
//	NomalMonster.strikingPower = (int)(Math.random()*(60)+30); // 몬스터 공격력 30~60 랜덤
//	NomalMonster.hitPoint = NomalMonster.hitPoint - Warrior.strikingPower; // 몬스터 체력은 전사 공격력에 비례하여 감소
//	Warrior.hitPoint = Warrior.hitPoint - (NomalMonster.strikingPower - Warrior.defensivePower); // 전사 체력은 몬스터 공격력-전사 방어력 계산해서 감소
//	System.out.println();
//	System.out.println("일반공격을 했습니다.");
//	System.out.println("몬스터의 체력이 " + NomalMonster.hitPoint + "남았습니다.");
//	System.out.println();
//	System.out.println("몬스터가 반격을 했습니다");
//	System.out.println("전사의 체력이 " + Warrior.hitPoint + " 남았습니다.");
//	System.out.println();
//	break;
//}
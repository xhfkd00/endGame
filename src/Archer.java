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

//	static int hitPoint = 5000; // 체력
//	static int magicPoint = 200; // 마력
//	static int strikingPower = 50;
////	static int 
//	static int tripleShot; // 트리플 샷 공격력
//	static int tripleShotMagicpoint; // 트리플 샷 마력소모
//	static int headShot; // 헤드샷 공격력
//	static int headShotMagicpoint; // 헤드샷 마력소모
//	static int stormyPoems; // 폭풍의시 공격력
//	static int stormyPoemsMagicpoint; // 폭풍의시 마력소모
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

//	ystem.out.println("현재 레벨 : " + Warrior.level + " 체력 : " + Warrior.hitPoint + " 마력 : " + Warrior.magicPoint + " 경험치 : "
//			+ Warrior.experiencePoint);
//	System.out.println("공격력 : " + Warrior.strikingPower + " 방어력 : " + Warrior.defensivePower + " 소지금 : " + Warrior.gold);

//	public void ArcherInformation(String name, int level, int hitPoint, int magicPoint, int experiencePoint,
//			int strikingPower, int defensivePower, int gold) {
//		System.out.println(
//				name + " 의 현재 레벨 : " + level + " 체력 : " + hitPoint + " 마력 : " + magicPoint + " 경험치 : " + experiencePoint);
//		System.out.println("공격력 : " + strikingPower + " 방어력 : " + defensivePower + " 소지금 : " + gold);
//		this.level = level;
//		this.hitPoint = hitPoint;
//		this.magicPoint = magicPoint;
//		this.experiencePoint = experiencePoint;
//		this.strikingPower = strikingPower;
//		this.defensivePower = defensivePower;
//		this.gold = gold;

//	}

	public void ArcherInformation() throws InterruptedException {

		System.out.println("궁수의 레벨 : " + level + "  체력 : " + hitPoint + " / " + maxHitPoint + "  마력 : " + magicPoint
				+ " / " + maxMagicPoint + "  경험치 : " + experiencePoint);
		Thread.sleep(500);
		System.out.println("공격력 : " + strikingPower + "  방어력 : " + defensivePower + "  소지금 : " + gold);
		System.out.println("아이템 : "+itemName);
	}

	public String ArcherIntroduction() {
		return "궁수는 높은 회피율과, 낮은 방어력이 특징입니다";
	}

	// 초록 달팽이 잡는 메소드
	@Override
	public void Attack() {
		NomalMonster.GreanSnail();

		NomalMonster.greanSnailHitPoint = NomalMonster.greanSnailHitPoint
				- (strikingPower - NomalMonster.greanSnailDefensivePower);
		hitPoint = hitPoint - (NomalMonster.strikingPower - defensivePower);


		while (NomalMonster.greanSnailHitPoint > 0/*&& hitPoint > 0*/) {

			if (NomalMonster.greanSnailHitPoint > 0) {
				System.out.println();
				System.out.println("일반공격을 했습니다.");
				System.out.println();
				System.out.println(
						"초록 달팽이의 체력 : " + NomalMonster.greanSnailHitPoint + " / " + NomalMonster.greanSnailMaxHitPoint);
				System.out.println();
				System.out.println("몬스터가 일반공격를 했습니다.");
				System.out.println();
				System.out.println("아처의 체력 : " + hitPoint + " / " + maxHitPoint);
				System.out.println("아처의 마력 : " + magicPoint + " / " + maxMagicPoint);
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
			System.out.println(" 몬스터를 처치했습니다.");
			System.out.println();
			System.out.println("경험치 + "+NomalMonster.greanSnailexperiencePoint+" , 소지금 + "+NomalMonster.greanSnailGold+" 획득했습니다.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("캐릭터가 죽었습니다.");
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
				System.out.println("트리플 샷을 사용했습니다.");
				System.out.println();
				System.out.println(
						"초록 달팽이의 체력 : " + NomalMonster.greanSnailHitPoint + " / " + NomalMonster.greanSnailMaxHitPoint);
				System.out.println();
				System.out.println("몬스터가 내려찍기를 했습니다.");
				System.out.println();
				System.out.println("아처의 체력 : " + hitPoint + " / " + maxHitPoint);
				System.out.println("아처의 마력 : " + magicPoint + " / " + maxMagicPoint);
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
			System.out.println(" 몬스터를 처치했습니다.");
			System.out.println();
			System.out.println("경험치 + "+NomalMonster.greanSnailexperiencePoint+" , 소지금 + "+NomalMonster.greanSnailGold+" 획득했습니다.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("캐릭터가 죽었습니다.");
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
				System.out.println("헤드 샷을 사용했습니다.");
				System.out.println();
				System.out.println(
						"초록 달팽이의 체력 : " + NomalMonster.greanSnailHitPoint + " / " + NomalMonster.greanSnailMaxHitPoint);
				System.out.println();
				System.out.println("몬스터가 내려찍기를 했습니다.");
				System.out.println();
				System.out.println("아처의 체력 : " + hitPoint + " / " + maxHitPoint);
				System.out.println("아처의 마력 : " + magicPoint + " / " + maxMagicPoint);
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
			System.out.println(" 몬스터를 처치했습니다.");
			System.out.println();
			System.out.println("경험치 + "+NomalMonster.greanSnailexperiencePoint+" , 소지금 + "+NomalMonster.greanSnailGold+" 획득했습니다.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("캐릭터가 죽었습니다.");
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
				System.out.println("폭풍의 시를 사용했습니다.");
				System.out.println();
				System.out.println(
						"초록 달팽이의 체력 : " + NomalMonster.greanSnailHitPoint + " / " + NomalMonster.greanSnailMaxHitPoint);
				System.out.println();
				System.out.println("몬스터가 내려찍기를 했습니다.");
				System.out.println();
				System.out.println("아처의 체력 : " + hitPoint + " / " + maxHitPoint);
				System.out.println("아처의 마력 : " + magicPoint + " / " + maxMagicPoint);
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
			System.out.println(" 몬스터를 처치했습니다.");
			System.out.println();
			System.out.println("경험치 + "+NomalMonster.greanSnailexperiencePoint+" , 소지금 + "+NomalMonster.greanSnailGold+" 획득했습니다.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("캐릭터가 죽었습니다.");
			System.out.println();

		}

	}

	// 빨간 달팽이 잡는 메소드
	public void AttackToRedSnail() {
		NomalMonster.RedSnail();

		NomalMonster.redSnailHitPoint = NomalMonster.redSnailHitPoint
				- (strikingPower - NomalMonster.redSnailDefensivePower);
		hitPoint = hitPoint - (NomalMonster.strikingPower - defensivePower);

		while (NomalMonster.redSnailHitPoint > 0) {

			if (NomalMonster.redSnailHitPoint > 0) {
				System.out.println();
				System.out.println("일반공격을 했습니다.");
//				System.out.println();
				System.out.println(
						"빨간 달팽이의 체력 : " + NomalMonster.redSnailHitPoint + " / " + NomalMonster.redSnailMaxHitPoint);
				System.out.println();
				System.out.println("몬스터가 일반공격를 했습니다.");
//				System.out.println();
				System.out.println("아처의 체력 : " + hitPoint + " / " + maxHitPoint);
				System.out.println("아처의 마력 : " + magicPoint + " / " + maxMagicPoint);
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
			System.out.println(" 몬스터를 처치했습니다.");
			System.out.println();
			System.out.println("경험치 + "+NomalMonster.redSnailexperiencePoint+" , 소지금 + "+NomalMonster.redSnailGold+" 획득했습니다.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("캐릭터가 죽었습니다.");
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
				System.out.println("폭풍의 시를 사용했습니다.");
				System.out.println();
				System.out.println(
						"초록 달팽이의 체력 : " + NomalMonster.redSnailHitPoint + " / " + NomalMonster.redSnailMaxHitPoint);
				System.out.println();
				System.out.println("몬스터가 내려찍기를 했습니다.");
				System.out.println();
				System.out.println("아처의 체력 : " + hitPoint + " / " + maxHitPoint);
				System.out.println("아처의 마력 : " + magicPoint + " / " + maxMagicPoint);
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
			System.out.println(" 몬스터를 처치했습니다.");
			System.out.println();
			System.out.println("경험치 + "+NomalMonster.redSnailexperiencePoint+" , 소지금 + "+NomalMonster.redSnailGold+" 획득했습니다.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("캐릭터가 죽었습니다.");
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
				System.out.println("폭풍의 시를 사용했습니다.");
				System.out.println();
				System.out.println(
						"초록 달팽이의 체력 : " + NomalMonster.redSnailHitPoint + " / " + NomalMonster.redSnailMaxHitPoint);
				System.out.println();
				System.out.println("몬스터가 내려찍기를 했습니다.");
				System.out.println();
				System.out.println("아처의 체력 : " + hitPoint + " / " + maxHitPoint);
				System.out.println("아처의 마력 : " + magicPoint + " / " + maxMagicPoint);
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
			System.out.println(" 몬스터를 처치했습니다.");
			System.out.println();
			System.out.println("경험치 + "+NomalMonster.redSnailexperiencePoint+" , 소지금 + "+NomalMonster.redSnailGold+" 획득했습니다.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("캐릭터가 죽었습니다.");
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
				System.out.println("폭풍의 시를 사용했습니다.");
				System.out.println();
				System.out.println(
						"초록 달팽이의 체력 : " + NomalMonster.redSnailHitPoint + " / " + NomalMonster.redSnailMaxHitPoint);
				System.out.println();
				System.out.println("몬스터가 내려찍기를 했습니다.");
				System.out.println();
				System.out.println("아처의 체력 : " + hitPoint + " / " + maxHitPoint);
				System.out.println("아처의 마력 : " + magicPoint + " / " + maxMagicPoint);
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
			System.out.println(" 몬스터를 처치했습니다.");
			System.out.println();
			System.out.println("경험치 + "+NomalMonster.redSnailexperiencePoint+" , 소지금 + "+NomalMonster.redSnailGold+" 획득했습니다.");

		}
		if (hitPoint <= 0) {
			System.out.println();
			System.out.println("캐릭터가 죽었습니다.");
			System.out.println();

		}
	}

	static BossMonster BossMonster = new BossMonster();
	// 보스몬스터 사냥
	public void AttackToBossMonster() throws InterruptedException {
		int attackPower = strikingPower -BossMonster.defensivePower;

		if (strikingPower -BossMonster.defensivePower < 0) {
			attackPower = 0;
		}
		BossMonster.hitPoint = BossMonster.hitPoint - attackPower;
		
		while (BossMonster.hitPoint > 0) {

			if (BossMonster.hitPoint > 0) {

				System.out.println();
				System.out.println("발록을 공격했습니다.");
				System.out.println();
				System.out.println("발록의 체력이 " + BossMonster.hitPoint + " / " + BossMonster.maxHitPoint);
				break;
			}

		}
		if ( BossMonster.hitPoint <= 0) {
			MusicThread.Done();
			System.out.println();
			System.out.println("발록을 처치했습니다!");
			System.out.println();
			System.out.println("발록처치하기 성공!!!!!!!!!");
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
				System.out.println("트리플 샷을 사용했습니다.");
				System.out.println();
				System.out.println("발록의 체력 " + BossMonster.hitPoint + " / "+ BossMonster.maxHitPoint);
				break;
			}

		}
		if ( BossMonster.hitPoint <= 0) {
			MusicThread.Done();
			System.out.println();
			System.out.println("발록을 처치했습니다!");
			System.out.println();
			System.out.println("발록처치하기 성공!!!!!!!!!");
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
				System.out.println("헤드 샷을 사용했습니다.");
				System.out.println();
				System.out.println("발록의 체력 " + BossMonster.hitPoint + " / "+ BossMonster.maxHitPoint);
				break;
			}

		}
		if ( BossMonster.hitPoint <= 0) {

			MusicThread.Done();
			System.out.println();
			System.out.println("발록을 처치했습니다!");
			System.out.println();
			System.out.println("발록처치하기 성공!!!!!!!!!");
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
				System.out.println("폭풍의 시를 사용했습니다.");
				System.out.println();
				System.out.println("발록의 체력 " + BossMonster.hitPoint + " / " + BossMonster.maxHitPoint);
				break;
			}

		}
		if ( BossMonster.hitPoint <= 0) {
			MusicThread.Done();
			System.out.println();
			System.out.println("발록을 처치했습니다!");
			System.out.println();
			System.out.println("발록처치하기 성공!!!!!!!!!");
			Thread.sleep(30000);
			MusicThread.DoneClose();
			
			System.exit(0);
		}
	}

	public void Behavior() {
		System.out.println();
		System.out.println("행동을 선택해 주세요.");
		System.out.println();
		System.out.println("1. 일반공격  2. 트리플 샷  3. 헤드 샷  4. 폭풍의 시  5. 돌아가기");
		System.out.print(" -> ");
	}

	public void ArcherLevelUp() {
		System.out.println();
		System.out.println("레벨업!!!!!!!!!!");
		System.out.println();
		System.out.println("최대 체력이 " + levelUpHitPoint + ", 최대 마력이 " + levelUpMagicPoint);
		System.out.println("공격력이 " + levelUpStrikingPower + ", 방어력이 " + levelUpDefensivePower + " 올랐습니다.");
		hitPoint = hitPoint + levelUpHitPoint;
		magicPoint += levelUpMagicPoint;
		this.strikingPower += levelUpStrikingPower;
		this.defensivePower += levelUpDefensivePower;
		level = level + 1;
		this.experiencePoint -= levelUpPoint;
		System.out.println("아처 체력 : " + hitPoint);
		System.out.println("아처 마력 : " + magicPoint);
		System.out.println("아처 공격력 : " + strikingPower);
		System.out.println("아처 방어력 : " + defensivePower);
		System.out.println("아처 레벨 : " + level);
	}

}

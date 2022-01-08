import java.util.Scanner;

public class Map {

	Character Character = new Character();
	NomalMonster NomalMonster = new NomalMonster();
	BossMonster BossMonster = new BossMonster();
	Archer Archer = new Archer();
	User User = new User();
	Scanner scanner = new Scanner(System.in);
	//생명의샘, 일반던전, 보스던전
//	change(Archer);
	public Map(){
		
		
	}
	
	@SuppressWarnings("static-access")
	public void MapLifeWell() {
//		Archer Archer = new Archer();

		System.out.println();
		System.out.println("생명의 샘으로 이동하셨습니다.");
		System.out.println();
		System.out.println("체력과 마력이 모두 회복되었습니다.");
		System.out.println();
		Archer.hitPoint = Archer.maxHitPoint;
		Archer.magicPoint = Archer.maxMagicPoint;
//		System.out.println("아처 히트포인트 : "+Archer.hitPoint);
//		System.out.println("아처 맥스 히트포인트 : "+Archer.maxHitPoint);
//		System.out.println("아처 마나포인트 : " +Archer.magicPoint);
//		System.out.println("아처 맥스 마나포인트 : "+Archer.maxMagicPoint);
		
	}
//	public int Test111(int hitPoint) {
//		
//		System.out.println("체력 : "+hitPoint);
//		System.out.println(" 체,마 다 찼음 사냥 ㄱㄱ");
//		return hitPoint = Archer.maxHitPoint;
//		
//	}
	
	public void NomalMonsterHunting() {
		System.out.println();
		System.out.println("일반 몬스터 사냥터로 이동하셨습니다.");
		System.out.println();
	}
	public void NoMalMonsterType() {
		System.out.println();
		System.out.println("1. 초록 달팽이  2. 빨간 달팽이");
		System.out.print(" - > ");
	}
	public void LevelUpHall() {
		System.out.println();
		System.out.println("레벨업의 전당으로 이동했습니다.");
		System.out.println();
		System.out.println("레벨업의 필요 경험치는 "+Character.levelUpPoint+" 입니다.");
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
		System.out.println("레벨업!!!!!!!!!!");
		System.out.println();
		System.out.println("최대 체력이 " + Archer.levelUpHitPoint +", 최대 마력이 "+Archer.levelUpMagicPoint);
		System.out.println("공격력이 "+Archer.levelUpStrikingPower +", 방어력이 "+Archer.levelUpDefensivePower+" 올랐습니다.");
		System.out.println();
//		System.out.println("아처 체력 : "+Archer.hitPoint);
//		System.out.println("아처 마력 : "+Archer.magicPoint);
//		System.out.println("아처 공격력 : "+Archer.strikingPower);
//		System.out.println("아처 방어력 : "+Archer.defensivePower);
//		System.out.println("아처 레벨 : " +Archer.level);
	}
	
	public void ArcherItem() {
		System.out.println();
		System.out.println("아이템 상점으로 이동했습니다.");
		System.out.println();
		System.out.println("1. 은 활   2. 화염의 활   3. 악몽의 활   4. 돌아가기");
		System.out.print(" -> ");
	}
	
	@SuppressWarnings("static-access")
	public void leveruptest() {
		System.out.println();
		System.out.println("1. 레벨업  2. 돌아가기");
		System.out.print(" -> ");
		int levelUp = scanner.nextInt();
		if (Archer.experiencePoint >= Character.levelUpPoint) { // 레벨업
//			Map.ArcherLevelUp();
			Archer.maxHitPoint = Archer.hitPoint + Archer.levelUpHitPoint;
			Archer.maxMagicPoint += Archer.levelUpMagicPoint;
			Archer.strikingPower += Archer.levelUpStrikingPower;
			Archer.defensivePower += Archer.levelUpDefensivePower;
			Archer.level = Archer.level + 1;
			Archer.experiencePoint -= Character.levelUpPoint;

		} else if (levelUp == 2) { // 돌아가기
//			break;
		} else if (Character.experiencePoint < 100) {
			System.out.println("경험치가 부족합니다.");
			System.out.println();

		} else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println();
//			break;
		}
	}

}
//levelUpHitPoint = 50;
//levelUpmagicPoint = 30;
//levelUpStrikingPower = 30;
//levelUpDefensivePower = 10;

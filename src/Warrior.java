
public class Warrior extends User {

	int skill = this.strikingPower * 2; // 삭제예정
	int skill_magicPoint = 10; // 삭제예정
	int max_hitPoint; // 전사 최대체력
	int max_magicPoint; // 전사 최대마력
	int finalAttack; // 전사 스킬 "파이널 어택"
	int finalAttackMagicpoint = 30; // 전사 스킬 "파이널 어택" 사용시 MP 감소량
	int dragonRoar; // 전사 스킬 "드래곤 로어"
	int dragonRoarMagicpoint = 50; // 전사 스킬 "드래곤 로어" 사용시 MP 감소량
	int upHammer; // 전사스킬 "업 해머"
	int upHammerMagicpoint = 300; // 전사 스킬 "업 해머" 사용시 MP 감소량, 필살기

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
		return "전사는 근접공격과 높은 방어력이 특징입니다";
	}

	public void Warrior_Attack() {
		System.out.println("일반공격을 했습니다");
		System.out.print("몬스터의 체력이 ");
		System.out.print(NomalMonster.hitPoint - this.strikingPower);
		System.out.print(" / ");
		System.out.print(NomalMonster.hitPoint);
		System.out.println(" 남았습니다.");
	}

	public int Warrior_skill() {
		return NomalMonster.hitPoint - skill;
	}

	public void FinalAttack() {
		hitPoint = NomalMonster.hitPoint - this.finalAttack;
		System.out.println("몬스터의 체력이" + hitPoint + "남았습니다");
		magicPoint = this.magicPoint - finalAttackMagicpoint;
		System.out.println("마력이 " + magicPoint + "남았습니다");
	}
	
	public void DragonRoar() {
		hitPoint = NomalMonster.hitPoint - this.dragonRoar;
		System.out.println("몬스터의 체력이 "+ hitPoint +"남았습니다");
		magicPoint = this.magicPoint - dragonRoarMagicpoint;
		System.out.println("마력이 " + magicPoint + "남았습니다");
	}
	
	public void UpHammer() {
		hitPoint = NomalMonster.hitPoint - this.upHammer;
		System.out.println("몬스터의 체력이 "+ hitPoint +" 남았습니다.");
		magicPoint = this.magicPoint - upHammerMagicpoint;
		System.out.println("마력이 " + magicPoint + " 남았습니다.");
	}

}


public class Character {

	public Character() {

	}

	// 속성
    int level = 1; // 레벨 속성
    int hitPoint; // 체력 속성
    int magicPoint; // 마력 속성
    int experiencePoint; // 경험치 속성
    int strikingPower; // 공격력 속성
    int defensivePower; // 방어력 속성
    int gold;
    int levelUpPoint = 100;
    int eventGold = 1000;

//	기능, 메서드
	public void Attack() throws InterruptedException {	
		hitPoint = hitPoint - strikingPower;
		System.out.println("체력이 " + hitPoint + " 남았습니다.");
	}

}

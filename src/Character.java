
public class Character {

	public Character() {

	}

	// �Ӽ�
    int level = 1; // ���� �Ӽ�
    int hitPoint; // ü�� �Ӽ�
    int magicPoint; // ���� �Ӽ�
    int experiencePoint; // ����ġ �Ӽ�
    int strikingPower; // ���ݷ� �Ӽ�
    int defensivePower; // ���� �Ӽ�
    int gold;
    int levelUpPoint = 100;
    int eventGold = 1000;

//	���, �޼���
	public void Attack() throws InterruptedException {	
		hitPoint = hitPoint - strikingPower;
		System.out.println("ü���� " + hitPoint + " ���ҽ��ϴ�.");
	}

}

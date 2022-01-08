import java.util.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Character Character = new Character();
		User User = new User();
		Warrior Warrior = new Warrior();
		Archer Archer = new Archer();
		NomalMonster NomalMonster = new NomalMonster();
		BossMonster BossMonster = new BossMonster();
		Map Map = new Map();
		Scanner scanner = new Scanner(System.in);
//		Music Music = new Music();
//		Music.BackGroundMusicStart();
//		MusicStartThread MusicStartThread = new MusicStartThread();
		MusicThread MusicThread = new MusicThread();
		MusicThread.start();
		EventThread eventThread = new EventThread();
//		eventThread.start();
		


		System.out.print("����");
		Thread.sleep(500);
		System.out.print(" ���ӿ�");
		Thread.sleep(500);
		System.out.print(" ����");
		Thread.sleep(500);
		System.out.print("�ϼ̽��ϴ�.");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.println(".");
		Thread.sleep(500);
		System.out.print("������ ");
		Thread.sleep(500);
		System.out.print("��ǥ�� ");
		Thread.sleep(500);
		System.out.println("�߷� óġ�Դϴ�.");
		Thread.sleep(500);
		System.out.println("�г����� �Է��� �ּ���.");
		String nickname = scanner.nextLine();
		System.out.println("�г����� '" + nickname + "' �Դϴ�.");
		while (true) { // ���� ����
			System.out.println("������ ������ �ּ���.");
			System.out.println(Warrior.Warrior_info());
			System.out.println(Archer.ArcherIntroduction());
			System.out.println("1. ����  2. �ü� ");
			System.out.print(" -> ");
			int Job_Choice = scanner.nextInt();

			if (Job_Choice == 1) { // ���� ����
//				MusicThread.BackGroundMusicClose();

				System.out.println();
				System.out.println("(]xxx[}=======================>");
				System.out.println();
				System.out.println("���縦 ���̽��ϴ�.");
				System.out.println("������ ����ؼ� ������ ��ų�� �� �� �ֽ��ϴ�.");
				System.out.println("������ ��ų�� '���̳� ����','�巡�� �ξ�','�� �ظ�'�Դϴ�.");
				System.out.println();
				while (true) {
					System.out.println("���� ���� : " + Warrior.level + " ü�� : " + Warrior.hitPoint + " ���� : "
							+ Warrior.magicPoint + " ����ġ : " + Warrior.experiencePoint);
					System.out.println("���ݷ� : " + Warrior.strikingPower + " ���� : " + Warrior.defensivePower + " ������ : "
							+ Warrior.gold);
					System.out.println("�̵��Ͻ� ���� ������ �ּ���.");
					System.out.println("1. �Ϲݸ���  2. ��������  3. ������ �� ");
					System.out.println("4. �������� ����  5. ������ ����");
					System.out.print(" -> ");
					if (Warrior.hitPoint <= 0) {
						System.out.println("ü���� �����ϴ�.");
						System.out.println("������ ������ �̵��Ͽ��� ü���� ȸ���� �ּ���.");
					}
					int Move = scanner.nextInt();
					if (Move == 1 && Warrior.hitPoint > 0) { // �Ϲݸ��� �̵�
						System.out.println();
						System.out.println("�Ϲݸ��͸� �����ƽ��ϴ�.");
						System.out.println();
						System.out.println("������ ������ �ּ���");
						while (NomalMonster.hitPoint > 0) {
							System.out.println("1. �Ϲݰ���  2. �� �ظ�  3. ��������");
							System.out.print(" -> ");
							int Attack = scanner.nextInt();
							// �Ϲ� ����
							if (Attack == 1) {
								while (NomalMonster.hitPoint > 0) { // ������ hitPoint�� 0�̻��� �� ����
									NomalMonster.strikingPower = (int) (Math.random() * (60) + 30); // ���� ���ݷ� 30~60 ����
									NomalMonster.hitPoint = NomalMonster.hitPoint - Warrior.strikingPower; // ���� ü���� ����
																											// ���ݷ¿� ����Ͽ�
																											// ����
									Warrior.hitPoint = Warrior.hitPoint
											- (NomalMonster.strikingPower - Warrior.defensivePower); // ���� ü���� ���Ͱ��ݷ�-����
																										// ���� ����ؼ� ����
									System.out.println();
									System.out.println("�Ϲݰ����� �߽��ϴ�.");
									System.out.println("������ ü���� " + NomalMonster.hitPoint + "���ҽ��ϴ�.");
									System.out.println();
									System.out.println("���Ͱ� �ݰ��� �߽��ϴ�");
									System.out.println("������ ü���� " + Warrior.hitPoint + " ���ҽ��ϴ�.");
									System.out.println();
									break;
								}
								if (NomalMonster.hitPoint <= 0) { // ������ hitPoint�� 0������ �� ����(���� ���)
									System.out.println("���Ͱ� �׾����ϴ�.");
									System.out.println("����ġ : + " + NomalMonster.experiencePoint + " , ������ : + "
											+ NomalMonster.gold + " �ö����ϴ�.");
									System.out.println();
									Warrior.experiencePoint = Warrior.experiencePoint + NomalMonster.experiencePoint; // ����
																														// ����ġ��
																														// ����
																														// ������
																														// ����
																														// ����ġ
																														// ȹ��
									Warrior.gold = Warrior.gold + NomalMonster.gold; // ���� ���� ���� ���� �� ���� ��� ȹ��
									NomalMonster.hitPoint = NomalMonster.max_hitPoint; // ���� ���� �� ���� ü�� ����
									break;
								}
								if (Warrior.hitPoint <= 0) { // ������ hitPoint�� 0������ �� ����(���� ���)
									System.out.println();
									System.out.println("ĳ���Ͱ� ����߽��ϴ�.");
									System.out.println();
									break;
								}
							}
							// ��ų ���
							if (Attack == 2) {
								while (NomalMonster.hitPoint > 0) {
									if (Warrior.magicPoint < Warrior.skill_magicPoint) { // ���� ��ų ����50�ʿ�, ���� 50�̸��϶� ��ų
																							// ��� �Ұ�
										System.out.println();
										System.out.println("������ �����ؼ� ��ų�� ������� ���մϴ�.");
										break;
									}
									NomalMonster.hitPoint = NomalMonster.hitPoint - Warrior.skill; // ���� ü���� ���� ��ų���ݷ¿�
																									// ���� ����
									Warrior.magicPoint = Warrior.magicPoint - Warrior.skill_magicPoint; // ���� ������ ���� ��ų
																										// ���°��ҿ� ���� ���°���
									Warrior.hitPoint = Warrior.hitPoint
											- (NomalMonster.strikingPower - Warrior.defensivePower); // ���� ü���� ����
																										// ���ݷ�-���� ����
																										// ����ؼ� ����
									System.out.println();
									System.out.println("�� �ظӸ� ����߽��ϴ�");
									System.out.println("������ ü���� " + NomalMonster.hitPoint + " ���ҽ��ϴ�");
									System.out.println();
									System.out.println("���Ͱ� �ݰ��� �߽��ϴ�");
									System.out.println("������ ü���� " + Warrior.hitPoint + " ���ҽ��ϴ�.");
									System.out.println();
									break;
								}
								if (NomalMonster.hitPoint <= 0) {
									Warrior.experiencePoint = Warrior.experiencePoint + NomalMonster.experiencePoint; // ����
																														// ����ġ��
																														// ����
																														// ����
																														// ��
																														// ����
																														// ����ġ
																														// ȹ��
									NomalMonster.hitPoint = NomalMonster.max_hitPoint; // ���� ���� �� ���� ü�� ����
									Warrior.gold = Warrior.gold + NomalMonster.gold; // ���� ���� ���� ���� �� ���� ��� ȹ��
									System.out.println();
									System.out.println("���͸� ��ҽ��ϴ�.");
									System.out.println("����ġ : + " + NomalMonster.experiencePoint + " , ������ : + "
											+ NomalMonster.gold + " �ö����ϴ�.");
									System.out.println();
									break;
								}
								if (Warrior.hitPoint <= 0) {
									System.out.println("ĳ���Ͱ� ����߽��ϴ�.");
									break;
								}
							}
							// ���� ����
							if (Attack == 3) {
								System.out.println("�������Խ��ϴ�.");
								break;
							}

						}

					}
					if (Move == 2) { // �������� �̵�
						System.out.println("�������ͷ� �̵��߽��ϴ�");

					}
					if (Move == 3) { // ������ �� �̵�
						System.out.println();
						System.out.println("������ ������ �̵��߽��ϴ�.");
						System.out.println();
						System.out.println("ü�°� ������ ��� ȸ���Ǿ����ϴ�.");
						System.out.println();
						Warrior.hitPoint = Warrior.max_hitPoint; // ���� ü�� ȸ��
						Warrior.magicPoint = Warrior.max_magicPoint; // ���� ���� ȸ��
					}
					if (Move == 4) { // �������� ���� �̵�
						System.out.println();
						System.out.println("�������� �������� �̵��߽��ϴ�.");
						if (Warrior.experiencePoint >= 100) { // ����ġ�� 100�̻��̸� ������
							System.out.println();
							System.out.println("������!");
							System.out.println();
							Warrior.level = Warrior.level + 1; // ����ġ 100�� ����ؼ� ���� 1 ����
							Warrior.max_hitPoint = Warrior.hitPoint + 150; // �ִ�ü�� 150 ����
							Warrior.max_magicPoint = Warrior.magicPoint + 50; // �ִ븶�� 50����
							Warrior.strikingPower += 20; // ���ݷ� 20 ����
							Warrior.experiencePoint -= 100; // ����ġ 100 ����
						} else { // ����ġ 100�̻��� �ƴϸ� ����ġ ������ �Ұ���
							System.out.println();
							System.out.println("����ġ�� �����մϴ�.");
							System.out.println();
						}
					}
					if (Move == 5) { // ������ ���� �̵�
						System.out.println();
						System.out.println("������ �������� �̵��߽��ϴ�.");
						while (true) {
							System.out.println("1. �����  2. ���� ���̵�  3. ���Ű�");
							System.out.println("4. �Ǹ����� ��  5. ��� ���� ��  6. �����");
							System.out.println("7. ������");
							System.out.print(" -> ");
							int Item_Choice = scanner.nextInt();
							if (Item_Choice == 1) {
								User.Warrior_Item_Sileveler_Sword();
								System.out.println("1. ����  2. �ǵ��ư���");
								int itemChoice = scanner.nextInt();
								if (itemChoice == 1) {
									System.out.println("dd");
								}
							}
							if (Item_Choice == 2) {
								User.Warrior_Item_Death_Blade();
								System.out.println("1. ����  2. �ǵ��ư���");
							}
							if (Item_Choice == 3) {
								User.Warrior_Item_Lightening_Sword();
								System.out.println("1. ����  2. �ǵ��ư���");
							}
							if (Item_Choice == 4) {
								User.Warrior_Item_DevilKings_Sword();
								System.out.println("1. ����  2. �ǵ��ư���");
							}
							if (Item_Choice == 5) {
								User.Warrior_Item_Ancient_Sword();
								System.out.println("1. ����  2. �ǵ��ư���");
							}
							if (Item_Choice == 6) {
								User.Warrior_Item_Execution_Sword();
								System.out.println("1. ����  2. �ǵ��ư���");
							}
							if (Item_Choice == 7) {
//							break;
								User.User_Item_woodenShied("��������", 10, 20); // �޼��带 ȣ���Ҷ� ���ڿ� ��Ʈ������ϴ� ���
								System.out.println("1. ����  2. �ǵ��ư���");
							} else {
								System.out.println("�߸� �����ϼ̽��ϴ�.");
								System.out.println();
								continue;
							}
						}

					} else {
						System.out.println("�߸� �����ϼ̽��ϴ�");
						System.out.println();
						break;
					}
				}
//				break;
			} else if (Job_Choice == 2) { // �ü� ����
				eventThread.start();
				
				System.out.println();
				System.out.print("�ü��� ");
				Thread.sleep(500);
				System.out.println("�����ϼ̽��ϴ�.");
				Thread.sleep(500);
				System.out.println();
				System.out.println("������ ����ؼ� ������ ��ų�� ����� �� �ֽ��ϴ�.");
				Thread.sleep(500);
				System.out.print("�ü��� ��ų�� ");
				Thread.sleep(500);
				System.out.print("Ʈ���� ��");
				Thread.sleep(200);
				System.out.print(", ");
				Thread.sleep(500);
				System.out.print("��� ��");
				Thread.sleep(200);
				System.out.print(", ");
				Thread.sleep(500);
				System.out.println("��ǳ�� �� �Դϴ�.");
				System.out.println();
				Thread.sleep(500);
				while (true) {
					Thread.sleep(500);
//					Archer.ArcherInformation("�ü�", 1, 300, 200, 0, 40, 20, 0); // ����, ü��, ����, ����ġ, ���ݷ�, ����, ���
					Archer.ArcherInformation(); // �ü� ����
					System.out.println();
					System.out.println("�̵��Ͻ� ���� ������ �ּ���.");
					Thread.sleep(500);
					System.out.println("1. �Ϲݸ���  2. ��������  3. ������ �� ");
					System.out.println("4. �������� ����  5. ������ ����");
					System.out.print(" -> ");
					int Move = scanner.nextInt();
					if (Move == 1) { // �Ϲݸ��� �̵�
						Map.NomalMonsterHunting(); // ���̵�
						Map.NoMalMonsterType(); // ���� 1. �ʷ� ������ 2. ���� ������
						int MonsterType = scanner.nextInt();
						if (MonsterType == 1) { // 1. �ʷ� ������
//							NomalMonster.GreanSnail();
							System.out.println();
							System.out.println("�ʷ� �����̸� �������ϴ�.");
							MusicThread.Snail();
							Thread.sleep(500);
							MusicThread.SnailClose();
							while (NomalMonster.greanSnailHitPoint > 0) {
								Archer.Behavior(); // 1. �Ϲݰ��� 2. Ʈ���� �� 3. ��� �� 4. ��ǳ�� �� 5. ���ư���
								int behavior = scanner.nextInt();
								if (behavior == 1) {
									Archer.Attack();
									MusicThread.Attack(); // ������ ������
									Thread.sleep(500); // ȿ���� ���ӽð�
									MusicThread.AttackClose();
								} else if (behavior == 2 && Archer.tripleShotMagicpoint < Archer.magicPoint) {
									MusicThread.TripleShot(); // Ʈ���ü� ȿ����
									Thread.sleep(500);// ȿ���� ���ӽð�
									MusicThread.TripleShotClose();
									Archer.TripleShotToGreanSnail();
								} else if (behavior == 2 && Archer.magicPoint < Archer.tripleShotMagicpoint) {
									System.out.println();
									System.out.println("������ �����մϴ�.");
								} else if (behavior == 3 && Archer.headShotMagicpoint < Archer.magicPoint) {
									MusicThread.HeadShot(); // ��弦 ȿ����
									Thread.sleep(1200); // ȿ���� ���ӽð�
									MusicThread.HeadShotClose();
									Archer.HeadShotToGreanSnail();
								} else if (behavior == 3 && Archer.magicPoint < Archer.headShotMagicpoint) {
									System.out.println();
									System.out.println("������ �����մϴ�.");
								} else if (behavior == 4 && Archer.stormyPoemsMagicpoint < Archer.magicPoint) {
									MusicThread.stormyPoems(); // ��ǳ�� �� ȿ����
									Thread.sleep(4000); // ȿ���� ���ӽð�
									MusicThread.StormyPoemsClose();
									Archer.StormyPoemsToGreanSnail(); 
								} else if (behavior == 4 && Archer.magicPoint < Archer.stormyPoemsMagicpoint) {
									System.out.println();
									System.out.println("������ �����մϴ�.");
								} else if (behavior == 5) {
									break;
								} else {
									System.out.println();
									System.out.println("�߸� �Է��ϼ̽��ϴ�.");
									System.out.println();
								}

							}
						} else if (MonsterType == 2) { // 2. ���� ������
							System.out.println();
							System.out.println("���� �����̸� �������ϴ�.");
							MusicThread.Snail(); // ������ ������
							Thread.sleep(500);
							MusicThread.SnailClose();
							while (NomalMonster.redSnailHitPoint > 0) {
								Archer.Behavior();// 1. �Ϲݰ��� 2. Ʈ���� �� 3. ��� �� 4. ��ǳ�� �� 5. ���ư���
								int behavior = scanner.nextInt();
								if (behavior == 1) {
									MusicThread.Attack(); // ��ó �⺻���� ȿ����
									Thread.sleep(500); // ȿ���� ���ӽð�
									MusicThread.AttackClose();
									Archer.AttackToRedSnail();
								} else if (behavior == 2 && Archer.tripleShotMagicpoint < Archer.magicPoint) {
									MusicThread.TripleShot(); // Ʈ���ü� ȿ����
									Thread.sleep(500);// ȿ���� ���ӽð�
									MusicThread.TripleShotClose();
									Archer.TripleShotToRedSnail();
								} else if (behavior == 2 && Archer.magicPoint < Archer.tripleShotMagicpoint) {
									System.out.println();
									System.out.println("������ �����մϴ�.");
								} else if (behavior == 3 && Archer.headShotMagicpoint < Archer.magicPoint) {
									MusicThread.HeadShot(); // ��弦 ȿ����
									Thread.sleep(1200);// ȿ���� ���ӽð�
									MusicThread.HeadShotClose();
									Archer.HeadShotToRedSnail();
								} else if (behavior == 3 && Archer.magicPoint < Archer.headShotMagicpoint) {
									System.out.println();
									System.out.println("������ �����մϴ�.");
								} else if (behavior == 4 && Archer.stormyPoemsMagicpoint < Archer.magicPoint) {
									MusicThread.stormyPoems(); // ��ǳ�ǽ� ȿ����
									Thread.sleep(4000);// ȿ���� ���ӽð�
									MusicThread.StormyPoemsClose();
									Archer.StormyPoemsToRedSnail();
								} else if (behavior == 4 && Archer.magicPoint < Archer.stormyPoemsMagicpoint) {
									System.out.println();
									System.out.println("������ �����մϴ�.");
								} else if (behavior == 5) {
									break;
								} else {
									System.out.println();
									System.out.println("�߸� �Է��ϼ̽��ϴ�.");
									System.out.println();
								}
							}

						}

					} else if (Move == 2) { // �������� �̵�
						System.out.println();
						System.out.println("�߷��� �����߽��ϴ�.");
						MusicThread.Ballock(); // �߷� ��������
						Thread.sleep(3000);// ȿ���� ���ӽð�
						MusicThread.BallockClose();
						while (BossMonster.hitPoint > 0) {
							Archer.Behavior();// 1. �Ϲݰ��� 2. Ʈ���� �� 3. ��� �� 4. ��ǳ�� �� 5. ���ư���
							Random Random = new Random();
							int monster = Random.nextInt(3) + 1; // ���� ���� ����
							int behavior = scanner.nextInt();

							if (BossMonster.hitPoint > 0 || Archer.hitPoint > 0) {
								if (behavior == 1) {
									MusicThread.Attack(); // �Ϲݰ��� ȿ����
									Thread.sleep(500);// ȿ���� ���ӽð�
									MusicThread.AttackClose();
									Archer.AttackToBossMonster();
									if (monster == 1) {
										BossMonster.Attack();
									} else if (monster == 2) {
										BossMonster.SwingTail();
									} else if (monster == 3) {
										BossMonster.EnergyExplosion();
									}

								} else if (behavior == 2 && Archer.tripleShotMagicpoint < Archer.magicPoint) { // Ʈ���ü�
																												// ���
									MusicThread.TripleShot(); // Ʈ���� �� ȿ����
									Thread.sleep(500);// ȿ���� ���ӽð�
									MusicThread.TripleShotClose();
									Archer.TripleShotToBallock();
									if (monster == 1) { // �߷� �Ϲݰ���
										BossMonster.Attack();
									} else if (monster == 2) { // �߷� �����ֵθ���
										BossMonster.SwingTail();
									} else if (monster == 3) { // �߷� ������ ��ü ����
										BossMonster.EnergyExplosion();
									}
								} else if (behavior == 2 && Archer.magicPoint < Archer.tripleShotMagicpoint) {// Ʈ���� ��
																												// �����
																												// ������
																												// ������
																												// ���Ұ�
									System.out.println();
									System.out.println("������ �����մϴ�.");
								}
								if (behavior == 3 && Archer.headShotMagicpoint < Archer.magicPoint) { // ��弦 ���
									MusicThread.HeadShot(); // ��弦 ȿ����
									Thread.sleep(1200);// ȿ���� ���ӽð�
									MusicThread.HeadShotClose();
									Archer.HeadShotToBallock();
									if (monster == 1) { // �߷� �Ϲݰ���
										BossMonster.Attack();
									} else if (monster == 2) { // �߷� �����ֵθ���
										BossMonster.SwingTail();
									} else if (monster == 3) { // �߷� ������ ��ü ����
										BossMonster.EnergyExplosion();
									}
								} else if (behavior == 3 && Archer.magicPoint < Archer.headShotMagicpoint) {// ��� �� �����
																											// ������ ������
																											// ���Ұ�
									System.out.println();
									System.out.println("������ �����մϴ�.");
								} else if (behavior == 4 && Archer.stormyPoemsMagicpoint < Archer.magicPoint) { // ��ǳ�ǽ�
																												// ���
									MusicThread.stormyPoems(); // ��ǳ�ǽ� ȿ����
									Thread.sleep(4000);// ȿ���� ���ӽð�
									MusicThread.StormyPoemsClose();
									Archer.StormyPoemsToBallock();
									if (monster == 1) { // �߷� �Ϲݰ���
										BossMonster.Attack();
									} else if (monster == 2) { // �߷� �����ֵθ���
										BossMonster.SwingTail();
									} else if (monster == 3) { // �߷� ��������ü ����
										BossMonster.EnergyExplosion();
									}
								} else if (behavior == 4 && Archer.magicPoint < Archer.stormyPoemsMagicpoint) {// ��ǳ�� ��
																												// �����
																												// ������
																												// ������
																												// ���Ұ�
									System.out.println();
									System.out.println("������ �����մϴ�.");
								}
								if (behavior == 5) {
									break;
								}

							}

						}

					} else if (Move == 3) { // ������ �� �̵�
						Map.MapLifeWell();

//						Archer.hitPoint = Archer.maxHitPoint;
//						Archer.magicPoint = Archer.maxMagicPoint;

					} else if (Move == 4) { // �������� ����
						Map.leveruptest();
//						System.out.println();
//						System.out.println("1. ������  2. ���ư���");
//						System.out.print(" -> ");
//						int levelUp = scanner.nextInt();
//						if (Archer.experiencePoint >= Character.levelUpPoint) { // ������
//							Map.ArcherLevelUp();
//							Archer.maxHitPoint = Archer.hitPoint + Archer.levelUpHitPoint;
//							Archer.maxMagicPoint += Archer.levelUpMagicPoint;
//							Archer.strikingPower += Archer.levelUpStrikingPower;
//							Archer.defensivePower += Archer.levelUpDefensivePower;
//							Archer.level = Archer.level + 1;
//							Archer.experiencePoint -= Character.levelUpPoint;
//
//						} else if (levelUp == 2) { // ���ư���
//							break;
//						} else if (Character.experiencePoint < 100) {
//							System.out.println("����ġ�� �����մϴ�.");
//							System.out.println();
//
//						} else {
//							System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//							System.out.println();
//							break;
//						}

					} else if (Move == 5) {
						Map.ArcherItem();
						int ItemChoice = scanner.nextInt();
						if (ItemChoice == 1) { // ��Ȱ
							User.SilverBow();
							int purchase = scanner.nextInt();
							if (purchase == 1 && Archer.gold >= User.silevelerSwordPrice) {
								System.out.println();
								System.out.println(User.silverBow + " �� �����ϼ̽��ϴ�.");
								System.out.println();
								System.out.println("���ݷ��� " + User.silevelerSwordAttackPower + " �ö����ϴ�.");
								System.out.println();
								Archer.itemName = User.silverBow;
								Archer.strikingPower += User.silevelerSwordAttackPower;
								Archer.gold -= User.silevelerSwordPrice;
							} else if (Archer.gold < User.silevelerSwordPrice) {
								System.out.println();
								System.out.println("�������� �����մϴ�.");
								System.out.println();
							} else if (purchase == 2) {
								System.out.println();
								System.out.println("���ư��⸦ �Է��ϼ̽��ϴ�.");
								System.out.println();
							} else {
								System.out.println();
								System.out.println("�߸� �Է��ϼ̽��ϴ�.");
								System.out.println();
							}
						} else if (ItemChoice == 2) {
							User.FireBow();
							int purchase = scanner.nextInt();
							if (purchase == 1 && Archer.gold >= User.fireBowPrice) {
								System.out.println();
								System.out.println(User.fireBow + " �� �����ϼ̽��ϴ�.");
								System.out.println();
								System.out.println("���ݷ��� " + User.fireBowAttackPower + " �ö����ϴ�.");
								System.out.println();
								Archer.itemName = User.fireBow;
								Archer.strikingPower += User.fireBowAttackPower;
								Archer.gold -= User.fireBowPrice;
							} else if (Archer.gold < User.fireBowPrice) {
								System.out.println();
								System.out.println("�������� �����մϴ�.");
								System.out.println();
							} else if (purchase == 2) {
								System.out.println();
								System.out.println("���ư��⸦ �Է��ϼ̽��ϴ�.");
								System.out.println();
							} else {
								System.out.println();
								System.out.println("�߸� �Է��ϼ̽��ϴ�.");
								System.out.println();
							}

						} else if (ItemChoice == 3) {
							User.NightmareBow();
							int purchase = scanner.nextInt();
							if (purchase == 1 && Archer.gold >= User.nightmareBowPrice) {
								System.out.println();
								System.out.println(User.nightmareBow + " �� �����ϼ̽��ϴ�.");
								System.out.println();
								System.out.println("���ݷ��� " + User.nightmareBowAttackPower + " �ö����ϴ�.");
								System.out.println();
								Archer.itemName = User.nightmareBow;
								Archer.strikingPower += User.nightmareBowAttackPower;
								Archer.gold -= User.nightmareBowPrice;
							} else if (Archer.gold < User.fireBowPrice) {
								System.out.println();
								System.out.println("�������� �����մϴ�.");
								System.out.println();
							} else if (purchase == 2) {
								System.out.println();
								System.out.println("���ư��⸦ �Է��ϼ̽��ϴ�.");
								System.out.println();
							} else {
								System.out.println();
								System.out.println("�߸� �Է��ϼ̽��ϴ�.");
								System.out.println();
							}

						} else if (ItemChoice == 4) {
							break;
						}
					}
				}

			} else {
				System.out.println();
				System.out.println("�߸� ���� �ϼ̽��ϴ�");
				System.out.println();
				continue;
			}
		}

	}

}

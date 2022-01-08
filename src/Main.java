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
		


		System.out.print("엔드");
		Thread.sleep(500);
		System.out.print(" 게임에");
		Thread.sleep(500);
		System.out.print(" 입장");
		Thread.sleep(500);
		System.out.print("하셨습니다.");
		Thread.sleep(500);
		System.out.print(".");
		Thread.sleep(500);
		System.out.println(".");
		Thread.sleep(500);
		System.out.print("게임의 ");
		Thread.sleep(500);
		System.out.print("목표는 ");
		Thread.sleep(500);
		System.out.println("발록 처치입니다.");
		Thread.sleep(500);
		System.out.println("닉네임을 입력해 주세요.");
		String nickname = scanner.nextLine();
		System.out.println("닉네임은 '" + nickname + "' 입니다.");
		while (true) { // 직업 선택
			System.out.println("직업을 선택해 주세요.");
			System.out.println(Warrior.Warrior_info());
			System.out.println(Archer.ArcherIntroduction());
			System.out.println("1. 전사  2. 궁수 ");
			System.out.print(" -> ");
			int Job_Choice = scanner.nextInt();

			if (Job_Choice == 1) { // 전사 선택
//				MusicThread.BackGroundMusicClose();

				System.out.println();
				System.out.println("(]xxx[}=======================>");
				System.out.println();
				System.out.println("전사를 고르셨습니다.");
				System.out.println("마력을 사용해서 강력한 스킬을 할 수 있습니다.");
				System.out.println("전사의 스킬은 '파이널 어택','드래곤 로어','업 해머'입니다.");
				System.out.println();
				while (true) {
					System.out.println("현재 레벨 : " + Warrior.level + " 체력 : " + Warrior.hitPoint + " 마력 : "
							+ Warrior.magicPoint + " 경험치 : " + Warrior.experiencePoint);
					System.out.println("공격력 : " + Warrior.strikingPower + " 방어력 : " + Warrior.defensivePower + " 소지금 : "
							+ Warrior.gold);
					System.out.println("이동하실 곳을 선택해 주세요.");
					System.out.println("1. 일반몬스터  2. 보스몬스터  3. 생명의 샘 ");
					System.out.println("4. 레벨업의 전당  5. 아이템 상점");
					System.out.print(" -> ");
					if (Warrior.hitPoint <= 0) {
						System.out.println("체력이 없습니다.");
						System.out.println("생명의 샘으로 이동하여서 체력을 회복해 주세요.");
					}
					int Move = scanner.nextInt();
					if (Move == 1 && Warrior.hitPoint > 0) { // 일반몬스터 이동
						System.out.println();
						System.out.println("일반몬스터를 마주쳤습니다.");
						System.out.println();
						System.out.println("공격을 선택해 주세요");
						while (NomalMonster.hitPoint > 0) {
							System.out.println("1. 일반공격  2. 업 해머  3. 도망가기");
							System.out.print(" -> ");
							int Attack = scanner.nextInt();
							// 일반 공격
							if (Attack == 1) {
								while (NomalMonster.hitPoint > 0) { // 몬스터의 hitPoint가 0이상일 때 실행
									NomalMonster.strikingPower = (int) (Math.random() * (60) + 30); // 몬스터 공격력 30~60 랜덤
									NomalMonster.hitPoint = NomalMonster.hitPoint - Warrior.strikingPower; // 몬스터 체력은 전사
																											// 공격력에 비례하여
																											// 감소
									Warrior.hitPoint = Warrior.hitPoint
											- (NomalMonster.strikingPower - Warrior.defensivePower); // 전사 체력은 몬스터공격력-전사
																										// 방어력 계산해서 감소
									System.out.println();
									System.out.println("일반공격을 했습니다.");
									System.out.println("몬스터의 체력이 " + NomalMonster.hitPoint + "남았습니다.");
									System.out.println();
									System.out.println("몬스터가 반격을 했습니다");
									System.out.println("전사의 체력이 " + Warrior.hitPoint + " 남았습니다.");
									System.out.println();
									break;
								}
								if (NomalMonster.hitPoint <= 0) { // 몬스터의 hitPoint가 0이하일 때 실행(몬스터 사망)
									System.out.println("몬스터가 죽었습니다.");
									System.out.println("경험치 : + " + NomalMonster.experiencePoint + " , 소지금 : + "
											+ NomalMonster.gold + " 올랐습니다.");
									System.out.println();
									Warrior.experiencePoint = Warrior.experiencePoint + NomalMonster.experiencePoint; // 전사
																														// 경험치는
																														// 몬스터
																														// 죽인후
																														// 몬스터
																														// 경험치
																														// 획득
									Warrior.gold = Warrior.gold + NomalMonster.gold; // 전사 골드는 몬스터 죽인 후 몬스터 골드 획득
									NomalMonster.hitPoint = NomalMonster.max_hitPoint; // 몬스터 죽은 후 몬스터 체력 리셋
									break;
								}
								if (Warrior.hitPoint <= 0) { // 전사의 hitPoint가 0이하일 때 실행(전사 사망)
									System.out.println();
									System.out.println("캐릭터가 사망했습니다.");
									System.out.println();
									break;
								}
							}
							// 스킬 사용
							if (Attack == 2) {
								while (NomalMonster.hitPoint > 0) {
									if (Warrior.magicPoint < Warrior.skill_magicPoint) { // 전사 스킬 마력50필요, 마력 50미만일땐 스킬
																							// 사용 불가
										System.out.println();
										System.out.println("마력이 부족해서 스킬을 사용하지 못합니다.");
										break;
									}
									NomalMonster.hitPoint = NomalMonster.hitPoint - Warrior.skill; // 몬스터 체력은 전사 스킬공격력에
																									// 따라 감소
									Warrior.magicPoint = Warrior.magicPoint - Warrior.skill_magicPoint; // 전사 마력은 전사 스킬
																										// 마력감소에 따라 마력감소
									Warrior.hitPoint = Warrior.hitPoint
											- (NomalMonster.strikingPower - Warrior.defensivePower); // 전사 체력은 몬스터
																										// 공격력-전사 방어력
																										// 계산해서 감소
									System.out.println();
									System.out.println("업 해머를 사용했습니다");
									System.out.println("몬스터의 체력이 " + NomalMonster.hitPoint + " 남았습니다");
									System.out.println();
									System.out.println("몬스터가 반격을 했습니다");
									System.out.println("전사의 체력이 " + Warrior.hitPoint + " 남았습니다.");
									System.out.println();
									break;
								}
								if (NomalMonster.hitPoint <= 0) {
									Warrior.experiencePoint = Warrior.experiencePoint + NomalMonster.experiencePoint; // 전사
																														// 경험치는
																														// 몬스터
																														// 죽인
																														// 후
																														// 몬스터
																														// 경험치
																														// 획득
									NomalMonster.hitPoint = NomalMonster.max_hitPoint; // 몬스터 죽은 후 몬스터 체력 리셋
									Warrior.gold = Warrior.gold + NomalMonster.gold; // 전사 골드는 몬스터 죽인 후 몬스터 골드 획득
									System.out.println();
									System.out.println("몬스터를 잡았습니다.");
									System.out.println("경험치 : + " + NomalMonster.experiencePoint + " , 소지금 : + "
											+ NomalMonster.gold + " 올랐습니다.");
									System.out.println();
									break;
								}
								if (Warrior.hitPoint <= 0) {
									System.out.println("캐릭터가 사망했습니다.");
									break;
								}
							}
							// 도망 가기
							if (Attack == 3) {
								System.out.println("도망나왔습니다.");
								break;
							}

						}

					}
					if (Move == 2) { // 보스몬스터 이동
						System.out.println("보스몬스터로 이동했습니다");

					}
					if (Move == 3) { // 생명의 샘 이동
						System.out.println();
						System.out.println("생명의 샘으로 이동했습니다.");
						System.out.println();
						System.out.println("체력과 마력이 모두 회복되었습니다.");
						System.out.println();
						Warrior.hitPoint = Warrior.max_hitPoint; // 전사 체력 회복
						Warrior.magicPoint = Warrior.max_magicPoint; // 전사 마력 회복
					}
					if (Move == 4) { // 레벨업의 전당 이동
						System.out.println();
						System.out.println("레벨업의 전당으로 이동했습니다.");
						if (Warrior.experiencePoint >= 100) { // 경험치가 100이상이면 레벨업
							System.out.println();
							System.out.println("레벨업!");
							System.out.println();
							Warrior.level = Warrior.level + 1; // 경험치 100을 사용해서 레벨 1 증가
							Warrior.max_hitPoint = Warrior.hitPoint + 150; // 최대체력 150 증가
							Warrior.max_magicPoint = Warrior.magicPoint + 50; // 최대마력 50증가
							Warrior.strikingPower += 20; // 공격력 20 증가
							Warrior.experiencePoint -= 100; // 경험치 100 감소
						} else { // 경험치 100이상이 아니면 경험치 레벨업 불가능
							System.out.println();
							System.out.println("경험치가 부족합니다.");
							System.out.println();
						}
					}
					if (Move == 5) { // 아이템 상점 이동
						System.out.println();
						System.out.println("아이템 상점으로 이동했습니다.");
						while (true) {
							System.out.println("1. 은장검  2. 데스 블레이드  3. 뇌신검");
							System.out.println("4. 악마왕의 검  5. 고대 신의 검  6. 집행검");
							System.out.println("7. 나가기");
							System.out.print(" -> ");
							int Item_Choice = scanner.nextInt();
							if (Item_Choice == 1) {
								User.Warrior_Item_Sileveler_Sword();
								System.out.println("1. 구매  2. 되돌아가기");
								int itemChoice = scanner.nextInt();
								if (itemChoice == 1) {
									System.out.println("dd");
								}
							}
							if (Item_Choice == 2) {
								User.Warrior_Item_Death_Blade();
								System.out.println("1. 구매  2. 되돌아가기");
							}
							if (Item_Choice == 3) {
								User.Warrior_Item_Lightening_Sword();
								System.out.println("1. 구매  2. 되돌아가기");
							}
							if (Item_Choice == 4) {
								User.Warrior_Item_DevilKings_Sword();
								System.out.println("1. 구매  2. 되돌아가기");
							}
							if (Item_Choice == 5) {
								User.Warrior_Item_Ancient_Sword();
								System.out.println("1. 구매  2. 되돌아가기");
							}
							if (Item_Choice == 6) {
								User.Warrior_Item_Execution_Sword();
								System.out.println("1. 구매  2. 되돌아가기");
							}
							if (Item_Choice == 7) {
//							break;
								User.User_Item_woodenShied("나무방패", 10, 20); // 메서드를 호출할때 인자에 스트링사용하는 방법
								System.out.println("1. 구매  2. 되돌아가기");
							} else {
								System.out.println("잘못 선택하셨습니다.");
								System.out.println();
								continue;
							}
						}

					} else {
						System.out.println("잘못 선택하셨습니다");
						System.out.println();
						break;
					}
				}
//				break;
			} else if (Job_Choice == 2) { // 궁수 선택
				eventThread.start();
				
				System.out.println();
				System.out.print("궁수를 ");
				Thread.sleep(500);
				System.out.println("선택하셨습니다.");
				Thread.sleep(500);
				System.out.println();
				System.out.println("마력을 사용해서 강력한 스킬을 사용할 수 있습니다.");
				Thread.sleep(500);
				System.out.print("궁수의 스킬은 ");
				Thread.sleep(500);
				System.out.print("트리플 샷");
				Thread.sleep(200);
				System.out.print(", ");
				Thread.sleep(500);
				System.out.print("헤드 샷");
				Thread.sleep(200);
				System.out.print(", ");
				Thread.sleep(500);
				System.out.println("폭풍의 시 입니다.");
				System.out.println();
				Thread.sleep(500);
				while (true) {
					Thread.sleep(500);
//					Archer.ArcherInformation("궁수", 1, 300, 200, 0, 40, 20, 0); // 레벨, 체력, 마력, 경험치, 공격력, 방어력, 골드
					Archer.ArcherInformation(); // 궁수 정보
					System.out.println();
					System.out.println("이동하실 곳을 선택해 주세요.");
					Thread.sleep(500);
					System.out.println("1. 일반몬스터  2. 보스몬스터  3. 생명의 샘 ");
					System.out.println("4. 레벨업의 전당  5. 아이템 상점");
					System.out.print(" -> ");
					int Move = scanner.nextInt();
					if (Move == 1) { // 일반몬스터 이동
						Map.NomalMonsterHunting(); // 맵이동
						Map.NoMalMonsterType(); // 몬스터 1. 초록 달팽이 2. 빨간 달팽이
						int MonsterType = scanner.nextInt();
						if (MonsterType == 1) { // 1. 초록 달팽이
//							NomalMonster.GreanSnail();
							System.out.println();
							System.out.println("초록 달팽이를 만났습니다.");
							MusicThread.Snail();
							Thread.sleep(500);
							MusicThread.SnailClose();
							while (NomalMonster.greanSnailHitPoint > 0) {
								Archer.Behavior(); // 1. 일반공격 2. 트리플 샷 3. 헤드 샷 4. 폭풍의 시 5. 돌아가기
								int behavior = scanner.nextInt();
								if (behavior == 1) {
									Archer.Attack();
									MusicThread.Attack(); // 달팽이 등장음
									Thread.sleep(500); // 효과음 지속시간
									MusicThread.AttackClose();
								} else if (behavior == 2 && Archer.tripleShotMagicpoint < Archer.magicPoint) {
									MusicThread.TripleShot(); // 트리플샷 효과음
									Thread.sleep(500);// 효과음 지속시간
									MusicThread.TripleShotClose();
									Archer.TripleShotToGreanSnail();
								} else if (behavior == 2 && Archer.magicPoint < Archer.tripleShotMagicpoint) {
									System.out.println();
									System.out.println("마력이 부족합니다.");
								} else if (behavior == 3 && Archer.headShotMagicpoint < Archer.magicPoint) {
									MusicThread.HeadShot(); // 헤드샷 효과음
									Thread.sleep(1200); // 효과음 지속시간
									MusicThread.HeadShotClose();
									Archer.HeadShotToGreanSnail();
								} else if (behavior == 3 && Archer.magicPoint < Archer.headShotMagicpoint) {
									System.out.println();
									System.out.println("마력이 부족합니다.");
								} else if (behavior == 4 && Archer.stormyPoemsMagicpoint < Archer.magicPoint) {
									MusicThread.stormyPoems(); // 폭풍의 시 효과음
									Thread.sleep(4000); // 효과음 지속시간
									MusicThread.StormyPoemsClose();
									Archer.StormyPoemsToGreanSnail(); 
								} else if (behavior == 4 && Archer.magicPoint < Archer.stormyPoemsMagicpoint) {
									System.out.println();
									System.out.println("마력이 부족합니다.");
								} else if (behavior == 5) {
									break;
								} else {
									System.out.println();
									System.out.println("잘못 입력하셨습니다.");
									System.out.println();
								}

							}
						} else if (MonsterType == 2) { // 2. 빨간 달팽이
							System.out.println();
							System.out.println("빨간 달팽이를 만났습니다.");
							MusicThread.Snail(); // 달팽이 등장음
							Thread.sleep(500);
							MusicThread.SnailClose();
							while (NomalMonster.redSnailHitPoint > 0) {
								Archer.Behavior();// 1. 일반공격 2. 트리플 샷 3. 헤드 샷 4. 폭풍의 시 5. 돌아가기
								int behavior = scanner.nextInt();
								if (behavior == 1) {
									MusicThread.Attack(); // 아처 기본공격 효과음
									Thread.sleep(500); // 효과음 지속시간
									MusicThread.AttackClose();
									Archer.AttackToRedSnail();
								} else if (behavior == 2 && Archer.tripleShotMagicpoint < Archer.magicPoint) {
									MusicThread.TripleShot(); // 트리플샷 효과음
									Thread.sleep(500);// 효과음 지속시간
									MusicThread.TripleShotClose();
									Archer.TripleShotToRedSnail();
								} else if (behavior == 2 && Archer.magicPoint < Archer.tripleShotMagicpoint) {
									System.out.println();
									System.out.println("마력이 부족합니다.");
								} else if (behavior == 3 && Archer.headShotMagicpoint < Archer.magicPoint) {
									MusicThread.HeadShot(); // 헤드샷 효과음
									Thread.sleep(1200);// 효과음 지속시간
									MusicThread.HeadShotClose();
									Archer.HeadShotToRedSnail();
								} else if (behavior == 3 && Archer.magicPoint < Archer.headShotMagicpoint) {
									System.out.println();
									System.out.println("마력이 부족합니다.");
								} else if (behavior == 4 && Archer.stormyPoemsMagicpoint < Archer.magicPoint) {
									MusicThread.stormyPoems(); // 폭풍의시 효과음
									Thread.sleep(4000);// 효과음 지속시간
									MusicThread.StormyPoemsClose();
									Archer.StormyPoemsToRedSnail();
								} else if (behavior == 4 && Archer.magicPoint < Archer.stormyPoemsMagicpoint) {
									System.out.println();
									System.out.println("마력이 부족합니다.");
								} else if (behavior == 5) {
									break;
								} else {
									System.out.println();
									System.out.println("잘못 입력하셨습니다.");
									System.out.println();
								}
							}

						}

					} else if (Move == 2) { // 보스몬스터 이동
						System.out.println();
						System.out.println("발록이 등장했습니다.");
						MusicThread.Ballock(); // 발록 등장음악
						Thread.sleep(3000);// 효과음 지속시간
						MusicThread.BallockClose();
						while (BossMonster.hitPoint > 0) {
							Archer.Behavior();// 1. 일반공격 2. 트리플 샷 3. 헤드 샷 4. 폭풍의 시 5. 돌아가기
							Random Random = new Random();
							int monster = Random.nextInt(3) + 1; // 몬스터 공격 유형
							int behavior = scanner.nextInt();

							if (BossMonster.hitPoint > 0 || Archer.hitPoint > 0) {
								if (behavior == 1) {
									MusicThread.Attack(); // 일반공격 효과음
									Thread.sleep(500);// 효과음 지속시간
									MusicThread.AttackClose();
									Archer.AttackToBossMonster();
									if (monster == 1) {
										BossMonster.Attack();
									} else if (monster == 2) {
										BossMonster.SwingTail();
									} else if (monster == 3) {
										BossMonster.EnergyExplosion();
									}

								} else if (behavior == 2 && Archer.tripleShotMagicpoint < Archer.magicPoint) { // 트리플샷
																												// 사용
									MusicThread.TripleShot(); // 트리플 샷 효과음
									Thread.sleep(500);// 효과음 지속시간
									MusicThread.TripleShotClose();
									Archer.TripleShotToBallock();
									if (monster == 1) { // 발록 일반공격
										BossMonster.Attack();
									} else if (monster == 2) { // 발록 꼬리휘두르기
										BossMonster.SwingTail();
									} else if (monster == 3) { // 발록 에너지 구체 난사
										BossMonster.EnergyExplosion();
									}
								} else if (behavior == 2 && Archer.magicPoint < Archer.tripleShotMagicpoint) {// 트리플 샷
																												// 사용할
																												// 마력이
																												// 없으면
																												// 사용불가
									System.out.println();
									System.out.println("마력이 부족합니다.");
								}
								if (behavior == 3 && Archer.headShotMagicpoint < Archer.magicPoint) { // 헤드샷 사용
									MusicThread.HeadShot(); // 헤드샷 효과음
									Thread.sleep(1200);// 효과음 지속시간
									MusicThread.HeadShotClose();
									Archer.HeadShotToBallock();
									if (monster == 1) { // 발록 일반공격
										BossMonster.Attack();
									} else if (monster == 2) { // 발록 꼬리휘두르기
										BossMonster.SwingTail();
									} else if (monster == 3) { // 발록 에너지 구체 난사
										BossMonster.EnergyExplosion();
									}
								} else if (behavior == 3 && Archer.magicPoint < Archer.headShotMagicpoint) {// 헤드 샷 사용할
																											// 마력이 없으면
																											// 사용불가
									System.out.println();
									System.out.println("마력이 부족합니다.");
								} else if (behavior == 4 && Archer.stormyPoemsMagicpoint < Archer.magicPoint) { // 폭풍의시
																												// 사용
									MusicThread.stormyPoems(); // 폭풍의시 효과음
									Thread.sleep(4000);// 효과음 지속시간
									MusicThread.StormyPoemsClose();
									Archer.StormyPoemsToBallock();
									if (monster == 1) { // 발록 일반공격
										BossMonster.Attack();
									} else if (monster == 2) { // 발록 꼬리휘두르기
										BossMonster.SwingTail();
									} else if (monster == 3) { // 발록 에너지구체 난사
										BossMonster.EnergyExplosion();
									}
								} else if (behavior == 4 && Archer.magicPoint < Archer.stormyPoemsMagicpoint) {// 폭풍의 시
																												// 사용할
																												// 마력이
																												// 없으면
																												// 사용불가
									System.out.println();
									System.out.println("마력이 부족합니다.");
								}
								if (behavior == 5) {
									break;
								}

							}

						}

					} else if (Move == 3) { // 생명의 샘 이동
						Map.MapLifeWell();

//						Archer.hitPoint = Archer.maxHitPoint;
//						Archer.magicPoint = Archer.maxMagicPoint;

					} else if (Move == 4) { // 레벨업의 전당
						Map.leveruptest();
//						System.out.println();
//						System.out.println("1. 레벨업  2. 돌아가기");
//						System.out.print(" -> ");
//						int levelUp = scanner.nextInt();
//						if (Archer.experiencePoint >= Character.levelUpPoint) { // 레벨업
//							Map.ArcherLevelUp();
//							Archer.maxHitPoint = Archer.hitPoint + Archer.levelUpHitPoint;
//							Archer.maxMagicPoint += Archer.levelUpMagicPoint;
//							Archer.strikingPower += Archer.levelUpStrikingPower;
//							Archer.defensivePower += Archer.levelUpDefensivePower;
//							Archer.level = Archer.level + 1;
//							Archer.experiencePoint -= Character.levelUpPoint;
//
//						} else if (levelUp == 2) { // 돌아가기
//							break;
//						} else if (Character.experiencePoint < 100) {
//							System.out.println("경험치가 부족합니다.");
//							System.out.println();
//
//						} else {
//							System.out.println("잘못 입력하셨습니다.");
//							System.out.println();
//							break;
//						}

					} else if (Move == 5) {
						Map.ArcherItem();
						int ItemChoice = scanner.nextInt();
						if (ItemChoice == 1) { // 은활
							User.SilverBow();
							int purchase = scanner.nextInt();
							if (purchase == 1 && Archer.gold >= User.silevelerSwordPrice) {
								System.out.println();
								System.out.println(User.silverBow + " 을 구매하셨습니다.");
								System.out.println();
								System.out.println("공격력이 " + User.silevelerSwordAttackPower + " 올랐습니다.");
								System.out.println();
								Archer.itemName = User.silverBow;
								Archer.strikingPower += User.silevelerSwordAttackPower;
								Archer.gold -= User.silevelerSwordPrice;
							} else if (Archer.gold < User.silevelerSwordPrice) {
								System.out.println();
								System.out.println("소지금이 부족합니다.");
								System.out.println();
							} else if (purchase == 2) {
								System.out.println();
								System.out.println("돌아가기를 입력하셨습니다.");
								System.out.println();
							} else {
								System.out.println();
								System.out.println("잘못 입력하셨습니다.");
								System.out.println();
							}
						} else if (ItemChoice == 2) {
							User.FireBow();
							int purchase = scanner.nextInt();
							if (purchase == 1 && Archer.gold >= User.fireBowPrice) {
								System.out.println();
								System.out.println(User.fireBow + " 을 구매하셨습니다.");
								System.out.println();
								System.out.println("공격력이 " + User.fireBowAttackPower + " 올랐습니다.");
								System.out.println();
								Archer.itemName = User.fireBow;
								Archer.strikingPower += User.fireBowAttackPower;
								Archer.gold -= User.fireBowPrice;
							} else if (Archer.gold < User.fireBowPrice) {
								System.out.println();
								System.out.println("소지금이 부족합니다.");
								System.out.println();
							} else if (purchase == 2) {
								System.out.println();
								System.out.println("돌아가기를 입력하셨습니다.");
								System.out.println();
							} else {
								System.out.println();
								System.out.println("잘못 입력하셨습니다.");
								System.out.println();
							}

						} else if (ItemChoice == 3) {
							User.NightmareBow();
							int purchase = scanner.nextInt();
							if (purchase == 1 && Archer.gold >= User.nightmareBowPrice) {
								System.out.println();
								System.out.println(User.nightmareBow + " 을 구매하셨습니다.");
								System.out.println();
								System.out.println("공격력이 " + User.nightmareBowAttackPower + " 올랐습니다.");
								System.out.println();
								Archer.itemName = User.nightmareBow;
								Archer.strikingPower += User.nightmareBowAttackPower;
								Archer.gold -= User.nightmareBowPrice;
							} else if (Archer.gold < User.fireBowPrice) {
								System.out.println();
								System.out.println("소지금이 부족합니다.");
								System.out.println();
							} else if (purchase == 2) {
								System.out.println();
								System.out.println("돌아가기를 입력하셨습니다.");
								System.out.println();
							} else {
								System.out.println();
								System.out.println("잘못 입력하셨습니다.");
								System.out.println();
							}

						} else if (ItemChoice == 4) {
							break;
						}
					}
				}

			} else {
				System.out.println();
				System.out.println("잘못 선택 하셨습니다");
				System.out.println();
				continue;
			}
		}

	}

}

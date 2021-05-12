package jp.co.aforce.test;

public class PracticeTest7 {
	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		Fighter fighter = new Fighter();

		airplane.fly(0);
		fighter.fly(0);
		fighter.fight(0);

		System.out.println("飛行します");
		System.out.println("飛行します");
		System.out.println("戦闘します");
	}
}

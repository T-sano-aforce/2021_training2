package jp.co.aforce.test;

public class Fighter extends Airplane {
	private int fly ;
	private int fight ;

	void fly(int value) {
		this.fly += value;
	}

	void fight(int value) {
		this.fight += value;
	}

}

package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {

	public static void main(String[] args) {

		int x = 10;
		int y = 28;
		double z = 3.14;

//練習問題1.
		System.out.println(x * y);

//練習問題2.
		System.out.println(y / x);
		System.out.println(y % x);

//練習問題3.
		double calculator = (y * z);
		System.out.println(calculator);

//練習問題4.
		double calculator2 = ++calculator;
		System.out.println(calculator2);

//練習問題5
		Random rand = new Random();
		int age = 23;
		int randomNumber = rand.nextInt(100);

		if(age > randomNumber) {
		System.out.println("より大きければ私のほうが年上です" + "randomNumber =" + randomNumber);
		}
		if(age < randomNumber) {
		System.out.println("より小さければ私のほうが年上です" + "randomNumber =" + randomNumber);
		}
		if(age == randomNumber) {
		System.out.println("が同じであれば私と同い年です" + "randomNumber =" + randomNumber);
		}
	}
}

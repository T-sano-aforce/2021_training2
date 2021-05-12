package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest5 {
	public static void main(String[]args) {
//練習問題1
	Random random = new Random();
	int fortune = random.nextInt(5) + 1;

		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
//練習問題2.
			int sum = 0;
			for(int i = 1; i < 101; i++) {
				if(i % 7 == 0) {
					System.out.println(sum);
				}
			}
		}
	}
}

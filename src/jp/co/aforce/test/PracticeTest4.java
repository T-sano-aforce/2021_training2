package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {

	public static void main(String[]args) {

//練習問題1.
//2でコーディングするのが適切である
//int型では==で比較するが、String型などの参照型はeqalsを使う。
//String型に==で比較すると参照先が同じかどうかを比較することになり、やりたいことが異なってしまうため。

//練習問題2.
	ArrayList<String>animals = new ArrayList<>();
	animals.add("犬");
	animals.add("猫");
	animals.add("うさぎ");
	animals.add("へび");
	System.out.println(animals);

//練習問題3.
	String cat = "猫";
	System.out.println(cat + "はリストに含まれています");

//練習問題4. 複数ある祝日がどうしても一つしか表示されない
	int myBirth = 5;
	switch(myBirth) {
	case 1:
		System.out.printf("元日","成人の日");
		break;
	case 2:
		System.out.printf("建国記念の日","天皇誕生日");
		break;
	case 3:
		System.out.printf("春分の日");
		break;
	case 4:
		System.out.printf("昭和の日");
		break;
	case 5:
		System.out.printf("憲法記念日","みどりの日","こどもの日");
		break;
	case 6:
		System.out.printf("なし");
		break;
	case 7:
		System.out.printf("海の日","スポーツの日");
		break;
	case 8:
		System.out.printf("山の日");
		break;
	case 9:
		System.out.printf("敬老の日","秋分の日");
		break;
	case 10:
		System.out.printf("なし");
		break;
	case 11:
		System.out.printf("文化の日","勤労感謝の日");
		break;
	case 12:
		System.out.printf("なし");
		break;
		}
//switch文を選んだ理由は多分岐処理の記述が可能であり、処理が比較的簡潔に書けるため。


	}
}

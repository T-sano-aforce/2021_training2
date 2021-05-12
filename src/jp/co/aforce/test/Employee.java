package jp.co.aforce.test;

public class Employee {
//練習問題3.
	private int number;
	private String name;
	private String gender;
	private int age;

	Employee(int number,String name,String gender,int age){
		this.number = number;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	void getDate() {
		System.out.println("番号は" + this.number + "、名前は"+ this.name + "、年齢は" + this.age + "歳です");
	}
}

package jp.co.aforce.test;

import java.util.HashMap;
import java.util.HashSet;

public class PracticeTest3 {

	public static void main(String[] args) {

//練習問題1.
		String[] man =  {"1","田中太郎","男性","27"};

//練習問題2.
		System.out.println(man[1]);

//練習問題4.
		Employee employee1 = new Employee(1,"田中太郎","男性",27);
		Employee employee2 = new Employee(2,"佐藤花子","女性",22);
		Employee employee3 = new Employee(3,"鈴木次郎","男性",31);

		HashSet<Employee> employees = new HashSet<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);


		for (Employee employee : employees) {
			employee.getDate();
		}

//練習問題5.
		HashMap<String,String>points = new HashMap<>();
		points.put("国語","90点" );
		points.put("数学", "80点");
		points.put("英語", "65点");

		for (HashMap.Entry<String,String>entry : points.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
//練習問題6.
//この表では、科目名と得点を扱っていたため、要素とキーを組み合わせるマップが適切だと考えた。

	}
}

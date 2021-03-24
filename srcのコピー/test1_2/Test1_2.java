package test1_2;

import java.util.Scanner;

public class Test1_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int nenrei = scan.nextInt();
		int kakaku = 0;

		if(nenrei == 0) {
			kakaku = 100;
		}else {
			kakaku = 500;
		}

		System.out.println("価格は" + kakaku + "円です。");

		scan.close();

	}

}

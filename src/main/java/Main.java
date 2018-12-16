package main.java;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1 && args.length != 2) {
			System.out.println("引数は1つか2つ指定する（1:入力ファイルのディレクトリパス, 2:出力するデータの行数）");
			return;
		}

		File dir = new File(args[0]);
		if (!dir.exists()) {
			System.out.println("コピー元のディレクトリが存在しない");
			return;
		}

		CreateAllTestData test = new CreateAllTestData(dir);
		int rows;
		try {
			if (args.length == 2) {
				rows = Integer.parseInt(args[1]);
				System.out.println(rows + "行のテストファイルを作成");
				test.create(rows);
			} else {
				System.out.println("5パターンのテストファイルを作成");
				test.create(10000);
				test.create(9999);
				test.create(1001);
				test.create(1000);
				test.create(999);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return;
		}
		
		System.out.println("正常に終了");

	}

}

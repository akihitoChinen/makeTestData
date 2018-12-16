package main.java;

import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFileWriter {

	public void writeToConsole(List<String> rows) {
		rows.stream().forEach((s) -> {
			System.out.println(s);
		});
	}

	public void writeToFile(File file, List<String> rows) {
		try {
			// FileWriterクラスのオブジェクトを生成する
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdir();
			} 
			FileWriter writer = new FileWriter(file);

			// PrintWriterクラスのオブジェクトを生成する
			PrintWriter pw = new PrintWriter(new BufferedWriter(writer));

			// ファイルに書き込む
			rows.stream().forEach((s) -> {
				pw.println(s);
			});

			// ファイルを閉じる
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

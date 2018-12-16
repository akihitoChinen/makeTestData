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
			// FileWriter�N���X�̃I�u�W�F�N�g�𐶐�����
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdir();
			} 
			FileWriter writer = new FileWriter(file);

			// PrintWriter�N���X�̃I�u�W�F�N�g�𐶐�����
			PrintWriter pw = new PrintWriter(new BufferedWriter(writer));

			// �t�@�C���ɏ�������
			rows.stream().forEach((s) -> {
				pw.println(s);
			});

			// �t�@�C�������
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

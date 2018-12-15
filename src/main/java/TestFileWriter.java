package main.java;

import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFileWriter {

	public void writeToConsole(List<String> rows) {
		rows.stream().forEach((s) -> {System.out.println(s);});
	}
	
	public void writeToFile(String path, List<String> rows) {
		try {
            // FileWriter�N���X�̃I�u�W�F�N�g�𐶐�����
            FileWriter file = new FileWriter(path);
            // PrintWriter�N���X�̃I�u�W�F�N�g�𐶐�����
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));
            
            //�t�@�C���ɏ�������
            rows.stream().forEach((s) -> {pw.println(s);});
            
            //�t�@�C�������
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}

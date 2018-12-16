package main.java;

import java.io.File;
import java.io.IOException;

public class CreateTestData {

	public CreateTestData(String inPath, File out, int rows) throws IOException {

		// ���f�[�^��ǂݍ���
		TestFileReader reader = new TestFileReader(inPath);
		try {
			reader.readRows(rows);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
		// ����
		
		
		// �f�[�^���o��
		TestFileWriter writer = new TestFileWriter();
//		writer.writeToConsole(reader.getRowList());
		writer.writeToFile(out, reader.getRowList());
				
	}

}

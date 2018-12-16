package main.java;

import java.io.File;
import java.io.IOException;

public class CreateTestData {

	public CreateTestData(String inPath, File out, int rows) throws IOException {

		// 元データを読み込む
		TestFileReader reader = new TestFileReader(inPath);
		try {
			reader.readRows(rows);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
		// 処理
		
		
		// データを出力
		TestFileWriter writer = new TestFileWriter();
//		writer.writeToConsole(reader.getRowList());
		writer.writeToFile(out, reader.getRowList());
				
	}

}

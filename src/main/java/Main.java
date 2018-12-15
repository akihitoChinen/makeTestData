package main.java;

public class Main {

	public static void main(String[] args) {
		String csvInPath = "C:\\Users\\croqu\\OneDrive\\Desktop\\sample.csv";
		String csvOutPath = "C:\\Users\\croqu\\OneDrive\\Desktop\\sample_.csv";
		
		// 元データを読み込む
		TestFileReader reader = new TestFileReader(csvInPath);
		reader.readRows(2);
		
		// 処理
		
		
		// データを出力
		TestFileWriter writer = new TestFileWriter();
		writer.writeToConsole(reader.getRowList());
		writer.writeToFile(csvOutPath, reader.getRowList());
		
	}

}

package main.java;

public class Main {

	public static void main(String[] args) {
		String csvInPath = "C:\\Users\\croqu\\OneDrive\\Desktop\\sample.csv";
		String csvOutPath = "C:\\Users\\croqu\\OneDrive\\Desktop\\sample_.csv";
		
		// ���f�[�^��ǂݍ���
		TestFileReader reader = new TestFileReader(csvInPath);
		reader.readRows(2);
		
		// ����
		
		
		// �f�[�^���o��
		TestFileWriter writer = new TestFileWriter();
		writer.writeToConsole(reader.getRowList());
		writer.writeToFile(csvOutPath, reader.getRowList());
		
	}

}

package main.java;

import java.io.File;
import java.io.IOException;

public class CreateAllTestData {
	private File inputDir = null;

	/**
	 * 第一引数に与えられたディレクトリ直下の全ファイルをrowsの行数に変換して出力する。
	 * 
	 * @param inputDirPath
	 * @param rows
	 */
	public CreateAllTestData(File inputDir) {
		this.inputDir = inputDir;
	}

	public void create(int rows) {

		File outputDir = getOutputDirPath(inputDir, rows);

		for (String file : inputDir.list()) {
			String inPath = inputDir.getPath() + "\\" + file;
			String outPath = outputDir.getPath() + "\\" + file;
			try {
				CreateTestData test = new CreateTestData(inPath, new File(outPath), rows);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private File getOutputDirPath(File inputDir, int rows) {
		String inputDirName = inputDir.getName();
		String outputDirName = inputDirName.split("_")[0] + "_" + rows;
		return new File(inputDir.getParent() + "\\" + outputDirName);
	}

}

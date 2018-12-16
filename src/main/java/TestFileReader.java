package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestFileReader {
	private String path = null;
	private List<String> rows = new ArrayList<>();
	
	public TestFileReader(String path) {
		this.path = path;
	}

	public void readRows(int rowN) throws IOException {
		try { 
			File f = new File(path);
			BufferedReader br = new BufferedReader(new FileReader(f));

			// 1行ずつCSVファイルを読み込む
			String row;
			while ((row = br.readLine()) != null) {
				rows.add(row);
				if (rows.size() == rowN) {
					break;
				}
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		    throw e;
	  }	
	}
	
	public List<String> getRowList() {
		return rows;
	}

}

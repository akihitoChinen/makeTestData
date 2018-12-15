package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class readCSV {
	private List<String> csvLineList = new ArrayList<>();
	
	public void readFile(int readableRowN) {
		try { 
			File f = new File("C:\\Users\\akihito.chinen\\Desktop\\sample.csv");
			BufferedReader br = new BufferedReader(new FileReader(f));

			String line;
			
			// 1�s����CSV�t�@�C����ǂݍ���
			while ((line = br.readLine()) != null) {
				String[] data = line.split("\n", 0); // �s���J���}��؂�Ŕz��ɕϊ�
				csvLineList.add(line);
				if (readableRowN == csvLineList.size() -1) {
					break;
				}
			}
			br.close();

		} catch (IOException e) {
		    System.out.println(e);
	  }	
	}
	
	
	
	public List<String> getCSVLineList() {
		return csvLineList;
	}

}

package main.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		readCSV test = new readCSV();
		test.readFile(5);
		test.getCSVLineList().stream().forEach((s) -> {System.out.println(s);});
	}

}

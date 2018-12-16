package main.java;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1 && args.length != 2) {
			System.out.println("������1��2�w�肷��i1:���̓t�@�C���̃f�B���N�g���p�X, 2:�o�͂���f�[�^�̍s���j");
			return;
		}

		File dir = new File(args[0]);
		if (!dir.exists()) {
			System.out.println("�R�s�[���̃f�B���N�g�������݂��Ȃ�");
			return;
		}

		CreateAllTestData test = new CreateAllTestData(dir);
		int rows;
		try {
			if (args.length == 2) {
				rows = Integer.parseInt(args[1]);
				System.out.println(rows + "�s�̃e�X�g�t�@�C�����쐬");
				test.create(rows);
			} else {
				System.out.println("5�p�^�[���̃e�X�g�t�@�C�����쐬");
				test.create(10000);
				test.create(9999);
				test.create(1001);
				test.create(1000);
				test.create(999);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return;
		}
		
		System.out.println("����ɏI��");

	}

}

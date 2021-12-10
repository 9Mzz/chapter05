package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneAppex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Reader fr = new FileReader("C:\\JavaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String line = br.readLine();	//이효리, 010-2222-3333, 031-2323-4441
			String[] dataArray = line.split(",");

			String name = dataArray[0];
			String hp = dataArray[1];
			String company = dataArray[2];

			if (line == null) {
				break;
			}
			System.out.println("이름: "+name);
			System.out.println("핸드폰: "+hp);
			System.out.println("회사: "+company);


		}

		br.close();
	}

}

package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PhoneApp {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("C:\\JavaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		while (true) {
			String str = br.readLine();

			if (str == null) {
				break;
			}
			String[] sArray = str.split(",");
			System.out.println("이름: " + sArray[0]);
			System.out.println("핸드폰: " + sArray[1]);
			System.out.println("회사: " + sArray[2]);
			System.out.println("=================================");
		}

		br.close();
	}
}

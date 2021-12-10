package com.javaex.ex05;

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
		
		Person p01 = new Person();
		
		while(true) {
			String str = br.readLine();

		if (str==null) {
			break;
		}
		System.out.println("이름: "+p01.getName());
		System.out.println("핸드폰: "+p01.getHp());
		System.out.println("회사: "+p01.getCompany());


		
		}
		br.close();
	}

}

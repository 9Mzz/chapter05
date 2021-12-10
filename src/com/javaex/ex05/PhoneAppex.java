package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneAppex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//ArrayList를 메모리에 올리기
		List<Person> pList = new ArrayList<Person>();

		//phoneDB읽어오기
		Reader fr = new FileReader("C:\\JavaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			//한줄씩 읽는다
			String line = br.readLine();
			if (line == null) {
				break;
			}
			//마지막이 아니면 
			String[] dArray = line.split(",");
			String name = dArray[0];
			String hp = dArray[1];
			String company = dArray[2];

			//Person객체를 생성하고 값을 넣어준다
			Person p01 = new Person(name, hp, company);	
			
			//*******리스트에 넣어준다.
			pList.add(p01);
		}
		//테스트용 출력 toString() 하용
		System.out.println(pList.toString());
		for(int i=0; i<pList.size(); i++) {
			System.out.println("이름: "+pList.get(i).getName());
			System.out.println("핸드폰: "+pList.get(i).getHp());
			System.out.println("회사: "+pList.get(i).getCompany());
			System.out.println("--------------------------------------------	");
		}
		
		
		br.close();
	}

}

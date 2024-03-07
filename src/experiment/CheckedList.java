package experiment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CheckedList {

	public static void main(String[] args) {

		List<String> listT = Collections.checkedList(new ArrayList<>(), String.class);
		listT.add("홍길동");
		listT.add("임꺾정");

		Object obj = listT;// object는 모든클래스의 클래스 개념이기에 타입으로 참조 가능

		List<String> listD = (List<String>) listT;
		listD.add("1.2");
		listD.add("3.1");

		System.out.println(listD);
		System.out.println("-----------");

		for (String n : listD) {// for-eche문
			System.out.println(n);
		}
		System.out.println("-----------");
		Iterator<String> ET;
		{// 이터레이터 방식
			System.out.println(obj);
		}

	}/*
		 * 자바에서 제공하는 원시 타입과 그에 해당하는 래퍼 클래스는 다음과 같습니다:
		 * 
		 * byte의 래퍼 클래스는 Byte 
		 * short의 래퍼 클래스는 Short 
		 * int의 래퍼 클래스는 Integer 
		 * long의 래퍼 클래스는Long 
		 * float의 래퍼 클래스는 Float 
		 * double의 래퍼 클래스는 Double 
		 * char의 래퍼 클래스는 Character
		 * boolean의 래퍼 클래스는 Boolean
		 */

}

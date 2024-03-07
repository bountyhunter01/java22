package experiment;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
//import java.util.Set;

public class IteratorEX {

	public static void main(String[] args) {
		ArrayList<String> carSet = new ArrayList<>();
		carSet.add("D");
		carSet.add("C");
		carSet.add("A");
		carSet.add("B");
		
		Iterator<String> it = carSet.iterator();
		while (it.hasNext()) {//while 버전
			System.out.println("차: "+it.next());
		}
		
		for(String carString : carSet) {//for 버전
			System.out.println("cars: "+carString);
		}
		System.out.println("---------------");
		ListIterator<String> it2 = carSet.listIterator();
		while(it2.hasNext()) {
			Object element = it2.next();
			it2.set(element+"#");
		}
//		The method set(String) is undefined for the type Iterator<String> //즉 이터레이터에서 set못씀
		System.out.println("수정된 차: "+carSet);
		System.out.println("역순 출력 결과 ");
		while(it2.hasPrevious()) {
			 Object element = it2.previous();
	            System.out.print(element + "><");//hasPrevious 역순이라는게 문자열은 그냥 적은순서의 역순을말함
		}
		System.out.println();
	}

}

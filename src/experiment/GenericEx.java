package experiment;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
	public static String test(List<?> list) {//?는 와일드 카드라고 컴파일 시점에서는 똑같다
		return "Wow "+list;//문자열 +제네릭리스트
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Gang");//이런 제네릭 안으로들어간거
		list1.add("ster");
		System.out.println(test(list1));
	}

}

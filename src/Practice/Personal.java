package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Personal {
	private String name;
	private int age;
	private String address;

	public Personal(String name, int age, String address) {
		this.address = address;
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Personal [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		try {
			HashMap<String, Personal> humen = new HashMap<String, Personal>();
		Scanner sc = new Scanner(System.in);
			while (true) {
				
				System.out.println("1.입력 2.삭제 3.출력 4.종료: ");
				int get = sc.nextInt();
				
				if (get == 1) {// 입력
					System.out.println("이름을 입력하시오-->");
					String nameString = sc.next();
					System.out.println("나이를 입력하시오-->");
					int agezz = sc.nextInt();
					System.out.println("주소를 입력하시오-->");
					String addrString = sc.next();//nextLine쓰면 오히려 안나온다 버퍼에 남은 엔터키 때문에

					humen.put(nameString, new Personal(nameString, agezz, addrString));

				} else if (get == 2) {// 삭제
					Set<String> keyss = humen.keySet();
					Iterator<String> it = keyss.iterator();
					System.out.println("Who remove the Person ");
					String rname = sc.nextLine();
					if (humen.containsKey(rname)) {
						humen.remove(rname);
					}
//					while (it.hasNext()) {//위에 거랑 결과는 같음
//					if (rname.equals(humen.get(it.next()).getName())) {
//						humen.remove(rname);

				} else if (get == 3) {// 출력
					Set<String> keyss = humen.keySet();
					Iterator<String> it = keyss.iterator();

					while (it.hasNext()) {
						Personal p = humen.get(it.next());
						System.out.print("이름: " + p.getName());
						System.out.print(", 나이: " + p.getAge());
						System.out.println(", 주소: " + p.getAddress());
					}

				} else if (get == 4) {
					System.out.println("프로그램 종료");
					System.exit(get);
				}
				System.out.println();// 줄바꿈
			}
//				humen.put("이파랑", new Personal("이파랑", 30, "서울"));
//				humen.put("마스 리", new Personal("마바람", 41, "한국계 미국인"));
//				humen.put("박주황", new Personal("박주황", 23, "부산"));
//				humen.put("김산", new Personal("김산", 29, "서울"));
//				humen.put("김파도", new Personal("김파도", 35, "인천"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

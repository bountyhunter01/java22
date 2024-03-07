package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bobgyb {
	Scanner sc = new Scanner(System.in);
	Map<String, Integer> Menu1 = new HashMap<>();

	void start() {//그냥 무슨 메뉴가 있는지만 보는곳
		Menu1.put("돼지국밥", 8000);
		Menu1.put("순대국밥", 7000);
		Menu1.put("내장국밥", 7500);

		while (true) {//선택창
			System.out.println("1. 메뉴판 보기");
			System.out.println("2. 계산하기");
			System.out.println("3. 처음 화면으로 돌아가기");
			System.out.println("4. 나가기");
			System.out.print("선택: ");
			while (true) {
				int choice = sc.nextInt();
				if (!MyBoB(choice)) {
					break;
				}
			}
//			sc.close();
		}
	}

	boolean MyBoB(int choice) {
		switch (choice) {
		case 1:
			System.out.println("메뉴판");
			for (String menu : Menu1.keySet()) {
				System.out.printf("%s : %d원\n", menu, Menu1.get(menu));
			}
			return true;

		case 2:
			System.out.print("메뉴 이름을 입력하세요: ");
			String menu = sc.next();
			System.out.print("수량을 입력하세요: ");
			int quantity = sc.nextInt();
			calculate(menu, quantity);
			return true;
		case 3:
			 System.out.println("1. 메뉴판 보기");
	            System.out.println("2. 계산하기");
	            System.out.println("3. 처음 화면으로 돌아가기");
	            System.out.println("4. 나가기");
	            System.out.print("선택: ");
	            return true;
			
		case 4:
			System.out.println("잘먹었습니다~~~");
			System.exit(0);
			return false;

		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

	void calculate(String menu, int quantity) {
		if (Menu1.containsKey(menu)) {
			int price = Menu1.get(menu);
			System.out.printf("%s %d개 : 총 %d원\n", menu, quantity, price * quantity);
		} else {
			System.out.println("메뉴가 존재하지 않습니다.");
		}
	}

	public static void main(String[] args) {
		Bobgyb my = new Bobgyb();
		my.start();
	}
}

package Practice;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ListNumberSort22 {

	public static void main(String[] args) {
		try {
			Set<Integer> oneNumber = new TreeSet<Integer>();
			Scanner sc = new Scanner(System.in);
			System.out.println("범위 정하시오");
			int N = sc.nextInt();
			
			for(int i = 0; i < N; i++) {
                System.out.println("숫자를 입력하시오");
                oneNumber.add(sc.nextInt());
            }
            
            System.out.println("\n정렬된 숫자:");
            for (Integer number : oneNumber) {
                System.out.println(number);
            }
			
		} catch (Exception e) {
			System.out.println("오류");
		}
//		13
//		22
//		33 이게 오름차순임
	}

}

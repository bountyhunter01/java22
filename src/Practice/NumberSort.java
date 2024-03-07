package Practice;

//import java.util.HashSet;
//import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class NumberSort {
//	배열 개수를 입력후 아무 숫자나 입력하면 알아서 정렬함

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("범위를 정하시오: ");
		int N= sc.nextInt();
		Set<Integer> num = new TreeSet<>();
		
		for(int i=0; i<N; i++ ) {
			System.out.println("숫자를 입력:");
			int number =sc.nextInt();
			num.add(number);
			
//			Iterator<Integer>setIterator = num.iterator();
//			for(Integer setInteger : num) {
//				System.out.println("숫자를 입력하시오: ");
//				setInteger = sc.nextInt();
//			}
		}
		
		System.out.println("정렬된 숫자:" +num);
		}catch (Exception e) {
			System.out.println("잘못된 방식입니다");
			
		}		

	}

}

package Practice;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class OtherNumberSort {//원래 버전도 좋은데 다시 되돌아가게끔 만들고 싶으면 이렇게하는게 맞다

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        try {
            System.out.println("범위를 정하시오: ");
            int N = sc.nextInt();
            Set<Integer> num = new TreeSet<>();
            inputNumbers(sc, N, num);

            System.out.println("정렬된 숫자:" + num);
        } catch (Exception e) {
            System.out.println("잘못된 방식입니다");
        }
    }

    private static void inputNumbers(Scanner sc, int N, Set<Integer> num) {
        for (int i = 0; i < N; i++) {
            try {
                System.out.println("숫자를 입력:");
                int number = sc.nextInt();
                num.add(number);     
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                sc.nextLine(); // 입력 버퍼 초기화
                i--; // 잘못된 입력을 다시 입력받기 위해 인덱스 감소
            }
        }
    }
}
     
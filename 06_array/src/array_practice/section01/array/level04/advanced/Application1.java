package array_practice.section01.array.level04.advanced;

public class Application1 {

	public static void main(String[] args) {

		/*
		 * 로또번호 생성기 6칸 짜리 정수 배열을 하나 생성하고 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤 오름차순
		 * 정렬하여 출력하세요
		 */

		int[] lotto = new int[6];

		// lotto 배열에 값 초기화
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1; // 1을 더하지 않으면 0부터 44까지의 난수가 생성된다. (0 ~ 0.999 * 45 = 0~44.xxx)
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) { // 중복 체크, 같은수가 있으면 인덱스를 하나 감소시키고 다시 랜덤 난수를 넣는다. (i 가 오르는 반복문에서 1 올랐기 떄문에)
					i--;
				}
			}

		}

		// lotto 배열 오름차순 정렬 시작
		for (int i = 1; i < lotto.length; i++) {

			for (int j = 0; j < i; j++) {
				if (lotto[i] < lotto[j]) { // 지금 비교하려는 수(인덱스 i번째 수) 보다 내 앞의 인덱스에 있는 수가 크다면 그 인덱스 자리와 교환
					int temp;
					temp = lotto[j]; // 큰 수를 임시변수에 대입
					lotto[j] = lotto[i]; // 작은 수( i번째 ) 를 큰 수 자리로 ( j 번째 ) 이동
					lotto[i] = temp; // 임시변수를 ( i 번째 ) 로 이동 ( 큰 수가 있을 뒷 자리 )
				}

			}

		}

		// lotto 배열 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}
}

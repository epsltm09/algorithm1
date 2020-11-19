/*
 *  과제명 : TermProject_1
 *  작성자 : 이예성
 *  학번 : 2015110607
 * 제출기한 : 11월 10일
 * ● N과 구간 a, b를 입력받고, 출력을내는프로그램을작성합니다.
 * 	○ N개의 데이터를 랜덤함수로 생성합니다.
 *	○ a, b 구간의 최소값 최대값 합계를 구해서 출력합니다.
 * ● 제출형식 : 자바소스
 */
import java.util.Scanner;

public class Main {

	class RandomData {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N개의 데이터를 랜덤함수로 생성합니다.");
		System.out.print("N을 입력하세요>");
		int size, a, b;
		size = sc.nextInt();
		System.out.println("구간 a b를 공백으로 구분하여 입력하세요>");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("N=%d, a=%d, b=%d", size, a, b);
		System.out.println();
		// N크기의 배열 생성
		int[]arr = new int[size];
		
		//배열에 난수 생성
		for(int i=0; i<size; i++) {
			arr[i] = (int)((Math.random()*(b-a+1)+a));
			//중복제거
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) i--;
			}
		}
		//확인
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		//최소값, 최대값
		int max=a, min=b;

		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
		}
		System.out.println();
		System.out.printf("최소값=%d, 최대값=%d, 합계=%d",min, max, min+max);
	}

}

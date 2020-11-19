/*
 *  과제명 : TermProject_2
 *  작성자 : 이예성
 *  학번 : 2015110607
 *  제출기한 : 11월 27일
 * ● N과 K를 입력받습니다.
 *	○ N개의 데이터를 랜덤으로 생성합니다.
 *	○ K개의 구간을 랜덤으로 생성합니다.
 *	○ 각 구간별로 최소값, 최대값, 합계를 기존의 방식을 이용해서 구합니다.
 * ● K를 고정하고 N을 변화시키면서그래프를그립니다.
 * ● N을 고정하고 K를 변화시키면서그래프를그립니다.
 * ● 현재 N, K에 대한이 알고리즘의성능을평가합니다.
 * ● 제출할내용
 *	○ 소스
 *	○ 표지 1장 포함하여, N, K 변화한 것에 대한 그래프 결과
 *	○ 알고리즘 성능 평가와 그 이유
 */
import java.util.Scanner;

class Test {

	int R_N;
	int R_K;
	int Max=1000000;
	int Min=0;
		
	public Test(int N, int K){
		R_N = N;
		R_K = K;
		// N크기의 배열 생성
		int[]arr = new int[R_N];
		//배열에 N개의 수를 랜덤으로 생성
		for(int i=0; i<R_N; i++) {
			arr[i] = (int)((Math.random()*(Max-Min)+Min));
			//중복제거
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) i--;
			}
		}
		// K개의 구간 저장
		int[][] KKK = new int[R_K][2];
		// K개의 구간 랜덤으로 생성
		for(int i=0; i<R_K; i++) {
			int a = (int)((Math.random()*(Max-Min)+Min));
			int b = (int)((Math.random()*(Max-a))+a);
			KKK[i][0] = a;
			KKK[i][1] = b;
		}
		int a, b;
		// 구간 a,b에서의 최소값, 최대값, 합계
		for(int i=0; i<R_K; i++) {
			a=KKK[i][0];
			b=KKK[i][1];
			int min=b, max=a;
			for(int j=0; j<arr.length; j++) {
				if(a<=arr[j]) {
					if(min>arr[j]) min=arr[j];
				}
				if(b>=arr[j]) {
					if(max<arr[j]) max=arr[j];	
				}
			}
		}
	}
	
	public void ChangeK(int K) {
		R_K = K;
	}
	public void ChangeN(int N) {
		R_N = N;
	}

}

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("N개의 데이터를 랜덤으로 생성합니다.");
		System.out.println("K개의 구간을 랜덤으로 생성합니다.");
		System.out.print("N과 K를 공백으로 구분하여 입력하세요>");
		int N, K;
		N = sc.nextInt();
		K = sc.nextInt();
		
		System.out.println();
		
		long t1 = System.currentTimeMillis();
		Test test = new Test(N, K);
		System.out.printf("N=%d, K=%d", N, K);
		long t2 = System.currentTimeMillis();
		System.out.println();
		System.out.println("Elapsed time is "+(t2-t1)+"ms");
		
		
	}
}

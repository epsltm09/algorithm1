/*
 *  ������ : TermProject_2
 *  �ۼ��� : �̿���
 *  �й� : 2015110607
 *  ������� : 11�� 27��
 * �� N�� K�� �Է¹޽��ϴ�.
 *	�� N���� �����͸� �������� �����մϴ�.
 *	�� K���� ������ �������� �����մϴ�.
 *	�� �� �������� �ּҰ�, �ִ밪, �հ踦 ������ ����� �̿��ؼ� ���մϴ�.
 * �� K�� �����ϰ� N�� ��ȭ��Ű�鼭�׷������׸��ϴ�.
 * �� N�� �����ϰ� K�� ��ȭ��Ű�鼭�׷������׸��ϴ�.
 * �� ���� N, K�� ������ �˰����Ǽ��������մϴ�.
 * �� �����ҳ���
 *	�� �ҽ�
 *	�� ǥ�� 1�� �����Ͽ�, N, K ��ȭ�� �Ϳ� ���� �׷��� ���
 *	�� �˰��� ���� �򰡿� �� ����
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
		// Nũ���� �迭 ����
		int[]arr = new int[R_N];
		//�迭�� N���� ���� �������� ����
		for(int i=0; i<R_N; i++) {
			arr[i] = (int)((Math.random()*(Max-Min)+Min));
			//�ߺ�����
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) i--;
			}
		}
		// K���� ���� ����
		int[][] KKK = new int[R_K][2];
		// K���� ���� �������� ����
		for(int i=0; i<R_K; i++) {
			int a = (int)((Math.random()*(Max-Min)+Min));
			int b = (int)((Math.random()*(Max-a))+a);
			KKK[i][0] = a;
			KKK[i][1] = b;
		}
		int a, b;
		// ���� a,b������ �ּҰ�, �ִ밪, �հ�
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
		
		
		System.out.println("N���� �����͸� �������� �����մϴ�.");
		System.out.println("K���� ������ �������� �����մϴ�.");
		System.out.print("N�� K�� �������� �����Ͽ� �Է��ϼ���>");
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

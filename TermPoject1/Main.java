/*
 *  ������ : TermProject_1
 *  �ۼ��� : �̿���
 *  �й� : 2015110607
 * ������� : 11�� 10��
 * �� N�� ���� a, b�� �Է¹ް�, ������������α׷����ۼ��մϴ�.
 * 	�� N���� �����͸� �����Լ��� �����մϴ�.
 *	�� a, b ������ �ּҰ� �ִ밪 �հ踦 ���ؼ� ����մϴ�.
 * �� �������� : �ڹټҽ�
 */
import java.util.Scanner;

public class Main {

	class RandomData {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N���� �����͸� �����Լ��� �����մϴ�.");
		System.out.print("N�� �Է��ϼ���>");
		int size, a, b;
		size = sc.nextInt();
		System.out.println("���� a b�� �������� �����Ͽ� �Է��ϼ���>");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("N=%d, a=%d, b=%d", size, a, b);
		System.out.println();
		// Nũ���� �迭 ����
		int[]arr = new int[size];
		
		//�迭�� ���� ����
		for(int i=0; i<size; i++) {
			arr[i] = (int)((Math.random()*(b-a+1)+a));
			//�ߺ�����
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) i--;
			}
		}
		//Ȯ��
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		//�ּҰ�, �ִ밪
		int max=a, min=b;

		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
		}
		System.out.println();
		System.out.printf("�ּҰ�=%d, �ִ밪=%d, �հ�=%d",min, max, min+max);
	}

}

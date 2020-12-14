import java.io.*;
import java.util.*;

public class Main {
	
	static void QuickSort(int[] list, int start, int end) {
		int pivot;
		int a, b, temp;

		if (start<end) 
		{
			a = start;
			b = end;
			pivot = list[start];

			while (a < b) 
			{
				while (pivot<list[b]) b--;
				while (list[a]<=pivot && a<b) a++;
				// a, b 교환
				temp = list[a];
				list[a] = list[b];
				list[b] = temp;
			}
			
			list[start] = list[b];
			list[b] = pivot;

			QuickSort(list, start, b - 1);
			QuickSort(list, b + 1, end);
			
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		int N;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N개의 데이터를 랜덤으로 생성합니다.");
		System.out.println("K개의 구간을 랜덤으로 생성합니다.");
		System.out.print("N을 입력하세요>");
		N = sc.nextInt();
		System.out.print("K를 입력하세요> ");
		int K = sc.nextInt();
		
		long t1 = System.currentTimeMillis();
		
		Random random = new Random();
		int[] array = new int[N];
		for(int i=0; i<array.length; i++) {
			int r = random.nextInt(N) + 1; 
			array[i] = r;
			int count = 0;
			for(int j=0; j<i; j++) {
				if(array[j]==array[i]) {
					count +=1;
				}
			}
			if(count==2) {
				i-=1;
			}
		}
		
		long e1 = System.currentTimeMillis();
		long t2 = System.currentTimeMillis();
		
		int st = 0;
		int ed = 0;
		for(int i=0; i<K; i++) {
			st = random.nextInt(N) + 1; 	
			ed = random.nextInt(N-st+1) + st;	
			int sum = 0;
			for(int j=(st-1); j<=(ed-1); j++) {
				sum += array[j];
			}
		}
		sc.close();
		QuickSort(array, st-1, ed-1);
		
		long e2 = System.currentTimeMillis();
	
		System.out.println("Elapsed time is " + ((e1-t1)+(e2-t2)) + "ms.");
		
	}
	
}
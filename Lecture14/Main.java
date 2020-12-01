import java.util.Scanner;

public class Main {
	
	static int histo(int[] v, int a, int b) {
		return 0;
	}
	static int histo(int[] v, int n) {
		return histo(v, 0, n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] v = new int[n];
		
		for(int i=0; i<n; i++) {
			v[i] = sc.nextInt();
		}
		
		int r = histo(v, n);
		
		System.out.println(r);
	}
}

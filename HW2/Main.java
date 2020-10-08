// 강의 : 자료구조 및 알고리즘1_최창락교수님
// 과제 : HW2_백준9012(괄호)
// 학번 : 2015110607
// 이름 : 이예성
import java.util.Scanner;

public class Main {
	
	public static boolean isValid(String vps) {
		char[] stack = new char[1024];
		int top = -1;
		
		for(int i=0; i<vps.length(); i++) {
			char ch = vps.charAt(i);
			if(ch =='(') {
				stack[++top] = ch;
			}
			else if(ch == ')' ) {
				if(top ==-1 || stack[top] != '(')
					return false;
				top--;
			}
		}
		return top == -1;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("테스트 횟수 입력> ");
		int n = sc.nextInt();
		// stack 메소드 사용
		while(n-- > 0) {
			System.out.print("괄호쌍 입력> ");
			String vps = sc.next();
			if(vps.length()>=2 && vps.length()<=50) {
				if(isValid(vps)) {		
					System.out.println("YES");		
				}
					else System.out.println("NO");
			} 
			else { System.out.println("문자열의 길이는 2이상 50이하입니다.");
			}
		}
		/*
		// 다른 방법
		while(n-- > 0) {
			int cnt = 0;
			String vps = sc.next();
			boolean check = true;
            
			for(char ch : vps.toCharArray()) {
				if(ch == '(')
					cnt++;
				else
					cnt--;
				if(cnt < 0) {
					check = false;
					break;
				}
			}
			if(cnt != 0)
				check = false;
			System.out.println(check ? "YES" : "NO");
		}
		sc.close();
		return;
		*/
		
	}
	
}

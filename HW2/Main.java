// ���� : �ڷᱸ�� �� �˰���1_��â��������
// ���� : HW2_����9012(��ȣ)
// �й� : 2015110607
// �̸� : �̿���
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
		System.out.print("�׽�Ʈ Ƚ�� �Է�> ");
		int n = sc.nextInt();
		// stack �޼ҵ� ���
		while(n-- > 0) {
			System.out.print("��ȣ�� �Է�> ");
			String vps = sc.next();
			if(vps.length()>=2 && vps.length()<=50) {
				if(isValid(vps)) {		
					System.out.println("YES");		
				}
					else System.out.println("NO");
			} 
			else { System.out.println("���ڿ��� ���̴� 2�̻� 50�����Դϴ�.");
			}
		}
		/*
		// �ٸ� ���
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

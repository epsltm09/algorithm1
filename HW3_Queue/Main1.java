/*
 * ���� 1)
 * ������ ���� �˰������� ���ڵ� �����ϴ� ���� �����մϴ�.
a) ť�� ������ �����մϴ�.
b) ���� n�� �Է¹޽��ϴ�.
c) ť�� n���� ������ ���ڵ��� �ֽ��ϴ�.  ������ ���ڴ� 0~10000 ������ �մϴ�.
d) ť���� ���� �ϳ��� �����ϴ�.
e) ���� �ֻ��� ���ڰ� ť���� ���� ���ں��� ���� ���, ���ÿ��� ���ڸ� ���� ť�� �ֽ��ϴ�.
f) ������ ����ְų� ���� �ֻ��� ���ڰ� ť���� ���� ���ں��� Ŭ������ e)�� �ݺ��մϴ�.
g) ���ÿ� ť���� ���� ���ڸ� �ֽ��ϴ�.
h) ť�� ������� �ʴٸ� d)�� ���� ������ ����մϴ�.
i) ���ÿ� �ִµ����͸� �ϳ��� �����鼭 �����͸� ����մϴ�.
 */
import java.util.Scanner;

class QueueA {
	int[] queue;
	int frontN;
	int backN;
	int queueSize;
	
	QueueA(int number){
		frontN=-1;
		backN=-1;
		queueSize = number;
		queue = new int[number];
	}
	// Ȯ��
	public boolean isEmpty() {
		if(frontN == backN) {
			frontN=backN=-1;
		}
		return(frontN == backN);	// false return
	}		
	// Ȯ��
	public boolean isFull() {
		return(backN==this.queueSize-1);
	}
	public void push(int n) {
		if(isFull()) {
			System.out.println("ť�� ����á���ϴ�.");
		} else {
			queue[++backN] = n;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("ť�� ������ϴ�.");
			return 0;
		} else {
			frontN = (frontN + 1)% this.queueSize; 
			return queue[frontN];
		}
	}
	public int peek() {
		if(isEmpty()) {
            System.out.println("ť�� ������ϴ�.");
            return 0;
        } else {
            return queue[frontN+1];
        }
	}
}

class Stack {

	int top;
	int[] stack;
	int size;
	
	Stack() {
		
	}	

	public Stack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}

	public int peek() {
		return stack[top];        
	}

	public void push(int value) {
		stack[++top] = value;
	}

	public int pop() {
		System.out.println(stack[top]);
		return stack[top--];
	}
	public void printStack() {
		System.out.println("STACK");
		for (int i = top; i >= 0; i--)
			System.out.println(stack[i]);
		System.out.println("STACK");
	}
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ť�� ���� n���� ���ڸ� �Է��ϼ���");
		int n = sc.nextInt();
		
		QueueA q_1 = new QueueA(n);
		Stack s_1 = new Stack(5);
		s_1.push(1000);
		s_1.push(2000);
		s_1.push(3000);
		s_1.push(4000);
		s_1.push(5000);
		
		
		for(int i=0; i<n; i++) {
			q_1.push((int)((Math.random()*10000)));
		}
		System.out.println(q_1.peek());
		while(q_1.isEmpty()) {
			if(q_1.peek() > 5000) {
				int x = s_1.pop();
				q_1.pop();
				q_1.push(x);
			}	
		}
		System.out.println(q_1.isEmpty());
		s_1.printStack();	
		
		
	}

}

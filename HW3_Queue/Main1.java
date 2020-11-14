/*
 * 문제 1)
 * 다음과 같은 알고리즘으로 숫자들 정렬하는 것을 수행합니다.
a) 큐와 스택을 생성합니다.
b) 숫자 n을 입력받습니다.
c) 큐에 n개의 랜덤한 숫자들을 넣습니다.  랜덤한 숫자는 0~10000 범위로 합니다.
d) 큐에서 숫자 하나를 꺼냅니다.
e) 스택 최상위 숫자가 큐에서 꺼낸 숫자보다 작은 경우, 스택에서 숫자를 꺼내 큐에 넣습니다.
f) 스택이 비어있거나 스택 최상위 숫자가 큐에서 꺼낸 숫자보다 클때까지 e)를 반복합니다.
g) 스택에 큐에서 꺼낸 숫자를 넣습니다.
h) 큐가 비어있지 않다면 d)로 가서 수행을 계속합니다.
i) 스택에 있는데이터를 하나씩 꺼내면서 데이터를 출력합니다.
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
	// 확인
	public boolean isEmpty() {
		if(frontN == backN) {
			frontN=backN=-1;
		}
		return(frontN == backN);	// false return
	}		
	// 확인
	public boolean isFull() {
		return(backN==this.queueSize-1);
	}
	public void push(int n) {
		if(isFull()) {
			System.out.println("큐가 가득찼습니다.");
		} else {
			queue[++backN] = n;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("큐가 비었습니다.");
			return 0;
		} else {
			frontN = (frontN + 1)% this.queueSize; 
			return queue[frontN];
		}
	}
	public int peek() {
		if(isEmpty()) {
            System.out.println("큐가 비었습니다.");
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
		System.out.println("큐에 넣을 n개의 숫자를 입력하세요");
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

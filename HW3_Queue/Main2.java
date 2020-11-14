/*
 * 문제 2)
 * 백준 10845
 */
import java.util.Scanner;

class Queue{
	int[] queue;
	int frontN = 0;
	int backN = -1;
	
	Queue(){
		
	}
	
	Queue(int number){
		queue = new int[number];
	}
	
	public void push(int x) {
		queue[++backN] = x;
	}
	
	public int size() {
		return backN - frontN + 1;
	}
	
	public boolean isEmpty() {
		if (size()==0)
			return true;
		else
			return false;
	}
	
	public int  pop() {
		if (isEmpty())
			return -1;
		else
			return queue[frontN++];
	}
	
	public int front() {
		if (isEmpty())
			return -1;
		else
			return queue[frontN];
	}
	
	public int back() {
		if (isEmpty())
			return -1;
		else
			return queue[backN];
	}
	
}
public class Main2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		Queue queue = new Queue(n);
		
		for(int i = 0; i <n; i++) {
			String command = scanner.next();
		
			switch(command) {
				case "push":
					int x = scanner.nextInt();
					queue.push(x);
					break;
				case "pop":
					System.out.println(queue.pop());
					break;
				case "empty":
					if (queue.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "front":
					System.out.println(queue.front());
					break;
				case "back":
					System.out.println(queue.back());
					break;
				case "size":
					System.out.println(queue.size());
					break;
			}
		}
	}
}
// 강의 : 자료구조 및 알고리즘1_최창락교수님
// 과제 : HW2_백준1874
// 학번 : 2015110607
// 이름 : 이예성
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
 
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 1;
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Character> result = new ArrayList<Character>();
        
        int example = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < example; i++) {
            int data = sc.nextInt();
            while (cnt <= data) {
                stack.push(cnt);
                cnt += 1;
                result.add('+');
            }
            
            if (stack.peek() == data) {
                stack.pop();
                result.add('-');
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
package 자료구조;

import java.util.Scanner;
import java.util.Stack;

public class P_1874_스택수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int N = sc.nextInt();
        int A[] = new int[N];
        boolean result = true;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        StringBuffer bf = new StringBuffer();
        int integer = 1;
        for(int j=0;j<A.length;j++) {
            if (A[j] >= integer) {
                for (int i = integer; i <= A[j]; i++) {
                    stack.push(integer);
                    bf.append("+\n");
                    integer++;
                }
                stack.pop();
                bf.append("-\n");
            }
            else{
                if (stack.pop() > A[j]) {
                    System.out.println("NO");
                    result = false;
                    break;

                }
                else{
                    bf.append("-\n");
                }
            }
        }
        if (result) {
            System.out.println(bf.toString());
        }

    }
}

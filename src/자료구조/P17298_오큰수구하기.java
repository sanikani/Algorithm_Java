package 자료구조;

import java.io.*;
import java.util.Stack;

public class P17298_오큰수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] A = new int[n];
        int[] answer = new int[n];
        String[] str = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && A[i] > A[stack.peek()]) {
                answer[stack.pop()] = A[i];
            }
                stack.push(i);
        }
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : answer) {
            bw.write(i+" ");
        }
        bw.write("\n");
        bw.flush();
    }
}

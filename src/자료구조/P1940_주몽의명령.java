package 자료구조;

import java.util.Arrays;
import java.util.Scanner;

public class P1940_주몽의명령 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int i=0;
        int j=N-1;
        int[] A = new int[N];
        int count = 0;
        for (int k = 0; k < N; k++) {
            A[k] = sc.nextInt();
        }
        Arrays.sort(A);
        while (i < j) {
            if (A[i] + A[j] < M) {
                i++;

            } else if ((A[i] + A[j] > M)) {
                j--;
            } else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}

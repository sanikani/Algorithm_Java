package 자료구조;

import java.util.Scanner;

public class P10986_나머지합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] S = new long[N];
        long[] C = new long[M];
        long count = 0;
        S[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            S[i] = S[i-1]+sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int r = (int) (S[i] % M);
            if (r == 0) {
                count++;
            }
            C[r]++;
        }
        for (int i = 0; i < M; i++) {
            count += C[i]*(C[i]-1)/2;
        }
        System.out.println(count);




    }
}

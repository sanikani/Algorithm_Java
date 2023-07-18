package 자료구조;

import java.util.Arrays;
import java.util.Scanner;

public class P1253_좋은수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        for (int i = 0; i < N; i++) {
            int x = 0;
            int y = N-1;
            while (x < y) {
                if (A[x] + A[y] == A[i]) {
                    if (x != i && y != i) {
                        count++;
                        break;
                    }else if(x==i){
                        x++;
                    }else if(y==i){
                        y--;
                    }
                }else if (A[x] + A[y] > A[i]) {
                    y--;
                }else {
                    x++;
                }
            }
        }
        System.out.println(count);
    }
}
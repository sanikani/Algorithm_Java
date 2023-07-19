package 자료구조;

import java.util.Scanner;

public class P1747_소수팰린드롬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        if (N == 1) {
            System.out.println(2);
            System.exit(0);
        }
        while (answer == 0){
            if(isPrime(N)&&pal(N)){
                    answer = N;
            }
            N++;
        }
        System.out.println(answer);


    }

    private static boolean isPrime(int N) {
        for (int i = 2; i <= (int) Math.sqrt(N); i++) {
            if(N%i==0){
                return false;
            }
        }
        return true;
    }

    private static boolean pal(int N){
        String str1 = String.valueOf(N);
        StringBuffer sb = new StringBuffer(str1);
        String str2 = sb.reverse().toString();
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }
}

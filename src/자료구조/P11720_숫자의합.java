package 자료구조;

import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = sc.next();
        int answer = 0;
        for (int i = 0; i < num.length(); i++) {
            answer += num.charAt(i)-'0';
        }
        System.out.println(answer);
    }

}

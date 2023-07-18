package 자료구조;

import java.util.Scanner;

public class P2018_연속된자연수의합구하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = 1;
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        while (end_index != N) {
            if (sum > N) {
                sum -= start_index;
                start_index++;
            } else if (sum < N) {
                end_index++;
                sum += end_index;
            } else{
                end_index++;
                sum += end_index;
                count++;
            }
        }
        System.out.println(count);
    }
}

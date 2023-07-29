package 자료구조;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (queue.size() != 1) {
            queue.remove();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}

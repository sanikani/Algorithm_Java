package 자료구조;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P11286_절댓값힙구현하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) ->{
                int x = Math.abs(o1);
                int y = Math.abs(o2);
                if(x==y){
                    return o1>o2 ? 1 : -1;
                }else{
                    return x-y;
                }
        }
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0;i<N;i++){
            int request = Integer.parseInt(br.readLine());
            if(request==0){
                if(priorityQueue.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(priorityQueue.remove());
                }
            }else{
                priorityQueue.add(request);
            }
        }
    }
}

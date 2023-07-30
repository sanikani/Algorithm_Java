package 정렬;

import java.util.Scanner;

public class P1427_내림차순정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] A = new int[str.length()];
        for (int i=0;i<str.length();i++){
            A[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for(int i=0; i<str.length();i++){
            int max = 0;
            for (int j=i+1;j<str.length();j++){
                if(A[j]>max){
                    max=A[j];
                }
                if(A[i]<max){
                    int temp = A[i];
                    A[i] = max;
                    A[j] = temp;
                }
            }
        }
        for (int i=0;i<str.length();i++){
            System.out.print(A[i]);
        }
    }
}

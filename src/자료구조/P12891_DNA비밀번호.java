package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA비밀번호 {
    static int[] myArr;
    static int[] checArr;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;
        char A[] = new char[S];
        checArr = new int[4];
        myArr = new int[4];
        A = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < 4; i++) {
            checArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }
        result = check(result);

        for (int i = P; i < S; i++) {
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            result = check(result);
        }

        System.out.println(result);
    }

    private static int check(int result) {
        if (myArr[0] >= checArr[0] && myArr[1] >= checArr[1] && myArr[2] >= checArr[2] && myArr[3] >= checArr[3]) {
            result++;
        }
        return result;
    }


    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                break;
            case 'C':
                myArr[1]++;
                break;
            case 'G':
                myArr[2]++;
                break;
            case 'T':
                myArr[3]++;
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                myArr[0]--;
                break;
            case 'C':
                myArr[1]--;
                break;
            case 'G':
                myArr[2]--;
                break;
            case 'T':
                myArr[3]--;
                break;
        }
    }

}

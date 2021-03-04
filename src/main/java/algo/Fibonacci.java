package algo;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("피보나치 함수 f(n)에 들어갈 n 입력:");
        int num = scanner.nextInt();
        System.out.println("피보나치 값: " + solution(num));
    }

    public static int solution(int n ){
        if(n<=0) return 0;
        if(n==1) return 1;
        int[] d = new int[n+1];
        d[1] = 1;
        d[2] = 2;
        for (int i = 3; i<=n;i++){
            d[i]=d[i-1]+d[i-2];
        }
        return d[n];
    }
}

package backjoon;

import java.util.Scanner;

public class 별찍기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String answer = "";
            for (int j = N - 1 - i; j > 0; j--) {
                answer += " ";
            }
            for (int k = 0; k <= i; k++) {
                answer += "*";
            }
            System.out.println(answer);
        }
    }
}
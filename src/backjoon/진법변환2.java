package backjoon;

import java.util.Scanner;

public class 진법변환2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

//        System.out.println(Character.toChars(65));
        String num = "";
        while (N > 0) {
            if (N % B >= 10) {
                num += String.valueOf(Character.toChars(N % B + 55));
            } else {
                num += N % B;
            }
            N /= B;
        }
        String answer = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            answer += num.charAt(i);
        }
        System.out.println(answer);
    }
}

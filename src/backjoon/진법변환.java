package backjoon;

import java.util.Scanner;

public class 진법변환 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();

        int multiple = 1;
        long answer = 0;
        for (int i = N.length() - 1; i >= 0; i--) {
            if (N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
                answer += (N.charAt(i) - 55) * multiple;
            } else {
                answer += (N.charAt(i) - '0') * multiple;
            }
            multiple *= B;
        }


        System.out.println(answer);
    }
}

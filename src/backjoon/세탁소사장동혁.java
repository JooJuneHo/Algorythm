package backjoon;

import java.util.Scanner;

public class 세탁소사장동혁 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        int[] cent = {25, 10, 5, 1};

        for (int i = 0; i < T; i++) {
            int change = sc.nextInt();
            int idx = 0;
            while (true) {
                if (idx == 4) {
                    break;
                }
                int cnt = change / cent[idx];
                System.out.print(cnt + " ");
                change = change - cnt * cent[idx];
                idx++;
            }
            System.out.println();
        }
    }
}

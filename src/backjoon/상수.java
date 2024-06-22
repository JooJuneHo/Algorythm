package backjoon;

import java.util.Scanner;

public class 상수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num1 = sc.next();
        String num2 = sc.next();

        String revNum1 = "";
        String revNum2 = "";
        for (int i = 0; i < num1.length(); i++) {
            revNum1 += String.valueOf(num1.charAt(2 - i));
            revNum2 += String.valueOf(num2.charAt(2 - i));
        }

        System.out.println(Math.max(Integer.parseInt(revNum1), Integer.parseInt(revNum2)));
    }
}

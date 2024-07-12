package backjoon;

import java.util.Scanner;

public class 팰린드롬인지확인하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String[] arr = str.split("");

        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(arr[i]);
        }

        if (str.contentEquals(reverse)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

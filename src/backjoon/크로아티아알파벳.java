package backjoon;

import java.util.Scanner;

public class 크로아티아알파벳 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = sc.nextLine();

        for (int i = 0; i < alpha.length; i++) {
            if (str.contains(alpha[i])) {
                str = str.replace(alpha[i], "!");
            }
        }
        System.out.println(str.length());
    }
}

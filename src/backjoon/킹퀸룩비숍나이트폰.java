package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 킹퀸룩비숍나이트폰 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] chess = {1, 1, 2, 2, 2, 8};
        String[] str = br.readLine().split(" ");

        Integer[] answer = new Integer[str.length];

        for (int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            answer[i] = chess[i] - num;
            System.out.print(answer[i] + " ");
        }
    }
}

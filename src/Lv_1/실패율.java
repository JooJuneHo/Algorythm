package Lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 실패율 {

    public static void main(String[] args) {
        PracSolution6 solution6 = new PracSolution6();
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution6.solution(N, stages)));
    }

}

class PracSolution6 {

    public int[] solution(int N, int[] stages) {
        // 스테이지별 도달했으나 클리어하지 못한 사람 수
        int[] currentStages = new int[N + 1];
        // 스테이지별 도달한 사람 수
        int[] clearStages = new int[N + 1];

        for (int i = 0; i < stages.length; i++) {
            // 스테이지에 도달한 플레이어 수 증가
            for (int j = 0; j < stages[i]; j++) {
                clearStages[j] += 1;
            }
            // 도달 했으나 클리어하지 못한 플레이어 수 증가
            currentStages[stages[i] - 1] += 1;
        }

        // 스테이지 번호와 실패율을 저장할 map
        Map<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            // 스테이지에 도달한 사람이 없거나 클리어한 사람이 없는 경우
            if (currentStages[i] == 0 || clearStages[i] == 0) {
                map.put(i + 1, 0.0);
            } else {
                // 실패율 계산하여 맵에 저장
                map.put(i + 1, (double) currentStages[i] / (double) clearStages[i]);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        // 실패율을 기준으로 내림차순 정렬
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        // 리스트를 배열로 변환하여 반환
        return list.stream().mapToInt(i -> i).toArray();
    }
}
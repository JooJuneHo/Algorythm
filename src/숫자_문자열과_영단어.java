public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        System.out.println(solution46.solution("one4seveneight"));
    }
}


class Solution46 {
    public int solution(String s) {
        int answer = 0;

        String[] arr = {"zero","one","two","three","four","five","siz","seven","eight","nine"};

        for(int i=0; i<arr.length; i++){
            if(s.contains(arr[i])){
                s = s.replace(arr[i],Integer.toString(i));
            }
        }

        answer = Integer.parseInt(s);



        return answer;
    }
}
import java.util.ArrayList;
import java.util.List;

public class ListString {
    public static void main(String[] args) {
        String s = "try";

        List<String> str = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            str.add(String.valueOf(s.charAt(i)));
        }
        for(int i=0; i<str.size(); i++){
//            System.out.println(str.get(i));
//            System.out.println(str.get(i).toUpperCase());
//            System.out.println(str.get(i));
            str.set(i, str.get(i).toUpperCase());
            System.out.println(str.get(i));
        }

    }
}

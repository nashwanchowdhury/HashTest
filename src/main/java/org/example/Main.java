package org.example;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("matthew", "matt");
        map.put("michael", "mix");
        map.put("arthur", "artie");

        String answer = map.get("matthew");
        System.out.println(nickname(answer));

    }
        public static String nickname(String answer) {
            return "The nickname of matthew is " + answer;
        }

}
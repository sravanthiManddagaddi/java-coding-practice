package Coding.Misc;

import java.util.Map;

public class FindChessboardColor {
    public static void main(String[] args) {
        String s = "a1";
        System.out.println(squareIsWhite(s));

    }
    public static boolean squareIsWhite(String coordinates){
        Map<String,Integer> coordinateMap = Map.of("a",1,
                "b",2,
                "c",3,
                "d",4,
                "e",5,
                "f",6,
                "g",7,
                "h",8);
        char[] ch = coordinates.toCharArray();
        int num = coordinateMap.get(String.valueOf(ch[0])) + (int)ch[1];
        return num % 2 != 0;
    }
}

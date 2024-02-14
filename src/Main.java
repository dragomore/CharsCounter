import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char target = in.next().charAt(0);
        String str = "1011110110111110000";
        System.out.println(getCharsCounter(str, target));
        System.out.println(getMaxRow(str, target));
    }
    public static int getCharsCounter(String str, char target){
//        int charsCounter = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++ ) {
            if( str.charAt(i) == target ){
//                charsCounter++;
                result.append(str.charAt(i));
            }
        }
//        return charsCounter;
        return result.length();
    }

    public static int getMaxRow(String str, char target){
        int maxRow = 0;
        int tmpRow = 0;
        for(int i = 0; i < str.length(); i++ ) {
            if( str.charAt(i) == target ) {
                tmpRow++;
                maxRow = Math.max(tmpRow, maxRow);
            }
            else
                tmpRow = 0;
        }
        return maxRow;
    }
}
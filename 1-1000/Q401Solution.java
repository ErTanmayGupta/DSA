import java.util.*;

public class Q401Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(readBinaryWatch(n));
    }

    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for(int hour = 0; hour < 12; hour++){
            for(int minute = 0; minute < 60; minute++){

                int ledsOn = Integer.bitCount(hour) + Integer.bitCount(minute);
                if(ledsOn == turnedOn){
                    String time = hour + ":" + String.format("%02d" , minute);
                    result.add(time);
                }
            }
        }
        return result;
    }
}

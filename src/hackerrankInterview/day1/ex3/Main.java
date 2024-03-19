package hackerrankInterview.day1.ex3;

public class Main {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }

    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        if(s.contains("PM")) {
            hour+=12;
            if (hour >= 24) {
                hour = hour - 12;
            }
            if (hour <= 9) {
                return "0" + hour + "" + s.substring(2, s.length() - 2);
            }
            return hour + "" + s.substring(2, s.length() - 2);
        }else{
            if(hour==12){
                return "00" + s.substring(2, s.length() - 2);

            }
            return s.substring(0, s.length()-2);
        }

    }

}

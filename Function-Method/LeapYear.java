public class LeapYear {

    public static void main(String[] args) {

        int year = 2020;

        int flag = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ? 1 : 0;
        if (flag == 1) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}

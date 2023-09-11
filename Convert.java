public class Convert {

    static String digits[] = { "zero", "one", "two", "three",
            "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigits(int number) {
        if (number == 0) {
            return;
        }

        int lastDigit = number % 10;
        printDigits(number / 10);
        System.out.println(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        printDigits(5689);
        System.out.println();

    }
}

import java.util.*;

public class ReverseNumber {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :  ");
        int n = sc.nextInt();

        while(n>0){
            int LastDigit= n % 10;
            System.out.print(LastDigit);
            n/=10;
        }
    }
}
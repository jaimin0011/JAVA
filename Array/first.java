package Array;
import java.util.*;
public class first {
    public static void main(String [] args){

    // Define Array
        int marks[] = new int[20];

        int numbers[] = {1,2,3,4};

        String name[] = {"jay" ,"mitul", "jaimin"};

    // input of array
        Scanner sc = new Scanner(System.in);

         marks[0] = sc.nextInt();
         marks[1] = sc.nextInt(); 
         
         System.out.println("java " + marks[0]);
         System.out.println("web " + marks[1]);

         marks[3] = marks[0]+ marks[1];
         System.out.println(marks[3]);

    }
    
}

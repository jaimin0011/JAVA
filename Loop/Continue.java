// Display all numbers entered by except multiples of 10
import java.util.*;

import javax.sound.midi.Synthesizer;
public class Continue {
    
    public static void main(String args[]){
            Scanner sc =new Scanner(System.in);
            do{
                System.out.print("Enter your number = ");
                int n = sc.nextInt();
                if (n % 10 == 0) { // no limit
                    continue;
                }
                System.out.println("number was : " + n);
            }while(true);
                                            
    }
}
 /*for(int i=1;i<=6;i++){
            if(i==1){
                        continue;
                   }
               System.out.println(i);
              }*/
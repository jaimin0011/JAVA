// Finding max number in array

package Array;
import java.util.*;
public class MaxNumber {

    public static int getlargest(int num[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
         for(int i=0;i<num.length;i++){
            if(max < num[i]){
                max=num[i];
            }if(min > num[i]){
                min = num[i];
                
            } 
         }System.out.println("small value is : " + min);
         
         return max;
    }
    public static void main(String[] args){
        int num[] ={4,9,8,3,2,7,5};
        
        System.out.println("max value is : "+  getlargest(num));
    }
    
}

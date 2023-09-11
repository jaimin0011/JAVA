import java.util.*;
public class Basic{

    //  public static void total(int a,int b){
    //     int sum = a+b;
    //     System.out.println("sum is =" + sum);
    // }


    // public static void swap(int a, int b){
    //     int temp =a;
    //     a=b;
    //     b=temp;
    //     System.out.println("a = " + b);
    //     System.out.println("b = " + a);
    // }

    public static int mul(int a,int b){
        int product = (a*b);
        return product;
    }

    public static void main(String args[]){
        
        Scanner sc= new Scanner(System.in);
        int a = 5;
        int b = 4;
        //total(a,b);
        //swap(a,b);
        mul(a,b);
        int p = mul(a,b);
        System.out.println(p);
        p =mul(50,100);
        System.out.println(p);
    }
}
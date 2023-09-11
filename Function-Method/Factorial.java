import java.util.*;

public class Factorial {

    public static int factorial(int n){
       int f=1;
       for(int i=1;i<=n;i++){
        f =f*i;
       }
        return f;
       
    }
    // binomial coeffciant
    public static int Binomial(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr =factorial(n-r);

        int bincoeff = (fact_n)/(fact_r*fact_nmr);
        return bincoeff;
    }



    public static void main(String args[]){
     
        // Scanner sc =new Scanner(System.in);
        // int n = sc.nextInt();
        // factorial(n);
        // //System.out.println(factorial(n));
        System.out.println(Binomial(5, 2));

    }  
}

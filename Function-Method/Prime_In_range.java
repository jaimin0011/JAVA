public class Prime_In_range {

    public static boolean PrimesInRange(int n){
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
        if(n%i==0){
            return false;
        }
        }
    }

    

    public static void main(String args[]){
        PrimesInRange(5);
    }
}

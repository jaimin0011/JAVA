package Array;

public class Subarray {

    public static void Sub(int num[]){
            // int start=0, last=num.length-1;
             for(int i=0; i<num.length;i++){
                int start = i;
                for(int j=i;j<num.length;j++){
                    int end = j;
                    for(int k=start; k<=end;k++){
                        System.out.print(num[k]+" ");
                        
                    }System.out.println();
                }System.out.println();
             }System.out.println();
    }
    public static void main(String [] args){
        int num[] = {1,2,3,4,5,6};
        Sub(num);
    }
}

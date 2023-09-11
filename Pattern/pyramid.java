//pyramid 
public class pyramid {
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<n;i++){            //for outer loop
            for(int j=n-i;j>1;j--){
            
                System.out.print(" "); //for space
              
            }
            for(int j=0;j<=i;j++){          //for columns
            
            System.out.print("*");
            }System.out.println();
        }
    }
}


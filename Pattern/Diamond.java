public class Diamond {
    public static void main(String args[]){
        int l=4;
        int n;
        for(int i=1;i<=l;i++){

            for(int j=1;j<=(l-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*(i)-1);j++){
                System.out.print("*");

            }System.out.println();
   
        }
        for(int i=l;i>=1;i--){

            for(int j=1;j<=(l-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*(i)-1);j++){
                System.out.print("*");

            }System.out.println();
   
        }
    }

}
/*   
   *
  ***
 *****
*******
*******
 *****
  ***
   * 
*/

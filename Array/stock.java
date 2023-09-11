public class stock {

    public static int buyandsellstocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0;i<prices.length;i++){
            if(buyprice < prices[i]){ //profit
                int profit = prices[i] - buyprice;
                maxProfit=Math.max(maxProfit, buyprice);    

            }else{
                buyprice = prices[i];
            }
        }
        return maxProfit;   
    }
    public static void main(String []args){
        int prices[]= {10,8,5,3,6};
        System.out.println(buyandsellstocks(prices));  

    }
}

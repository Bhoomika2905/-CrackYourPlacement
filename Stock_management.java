import java.util.Scanner;  
public class Stock_management{
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int highest;
        int lowest=prices[0];
        int high=-1;
        int low=0;
        for (int i=0; i<n; i++) {
            if(prices[i]<lowest){
                lowest=prices[i];
                low=i;
            }
        }
        highest=prices[low];
        for (int i=low+1; i<n; i++) {
            if(prices[i]>lowest){
                if(prices[i]>highest){
                highest=prices[i];
                high=i;}
            }
        }
       
        
        if(high>low){
            return(highest-lowest);
            //System.out.println(highest-lowest);
        }
        else{
            return(0);
            //System.out.println(0);
        } 
        
    }


public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);  
int[] prices = new int[7];  
for(int i=0; i<7; i++)  
{  
//reading array elements from the user   
prices[i]=sc.nextInt();  
}  
sc.close();
}
}
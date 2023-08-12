//import java.util.Scanner;  
public class Move_Zeroes 
{  
public static void main(String[] args)   
{  
int n=5;  
/*Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
n=sc.nextInt();  
//creates an array in the memory of length 10  
int[] array = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
// accessing array elements using the for loop */
int[] array = {0,1,0,3,12};
for (int j=0; j<n; j++) {
for (int i=0; i<n-1; i++)   {
    if(array[i]==0){
        array[i]=array[i+1];
        array[i+1]=0;
    }
}}
for (int i=0; i<n; i++)   
{  
System.out.print(array[i]+" ");  
}  
}  
}  

/* 
import java.util.Scanner;  
public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        for (int j=0; j<n; j++) {
        for (int i=0; i<n-1; i++)   {
            if(nums[i]==0){
            nums[i]=nums[i+1];
            nums[i+1]=0;
        }
    }
    }
    System.out.print("["); 
        for (int i=0; i<n; i++)   
    {  
        System.out.print(nums[i]+",");  
    } 
    System.out.print("["); 
    }
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);  
int[] nums = new int[5];  
for(int i=0; i<5; i++)  
{  
//reading array elements from the user   
nums[i]=sc.nextInt();  
}  

}
}  */
 
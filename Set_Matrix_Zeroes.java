import java.util.Scanner; 

public class Set_Matrix_Zeroes{
    public static void main(String [] args) {
        int[][] arr = { {0,1,0,1,2,3}, {2,3,2,3,2,0}, {4,1,2,4,1,2} , {1,1,3,4,1,2} };
        int n=4;
        int m=6;
        int[][] arr2 = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(arr[i][j]==0){
                        for(int k=0;k<m;k++){
                           arr2[i][k]=-1;
                        }
                        for(int l=0;l<n;l++){
                           arr2[l][j]=-1;
                        }
                        }
                   }
                   }

            for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr2[i][j]==-1){
                    arr2[i][j]=0;}
                else{
                        arr2[i][j]=arr[i][j];
                        
                    }
               System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
            }
        }
    }
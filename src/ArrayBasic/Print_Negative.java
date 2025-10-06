package ArrayBasic;
import java.util.Scanner;

public class Print_Negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int n=sc.nextInt();
        System.out.print("Enter Element in array: ");
        int arr[]=new int[n];
        //input
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Printing
        for (int i=0;i<n;i++){
            if(arr[i]<0) System.out.print(arr[i]+" ");
        }
    }
}

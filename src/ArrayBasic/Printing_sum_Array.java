package ArrayBasic;

import java.util.Scanner;

public class Printing_sum_Array {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int n=sc.nextInt();
//        input
        System.out.print("Enter Element: ");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        printing
        int sum=0;
        for (int i=0;i<n;i++){
            sum +=arr[i];
        }
            System.out.print(sum+" ");
    }
}

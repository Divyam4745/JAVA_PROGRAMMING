package ArrayBasic;
import java.util.Scanner;

public class Outputarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int [] a={34,45,56,67,78,89,100};
//        for (int i=0;i<=6;i++){
//            System.out.print(a[i]+" ");
//        }
        int[] Divyam =new int[7];
//        for (int i=0;i<Divyam.length;i++){
//            System.out.print(Divyam[i]+" ");
//        }
      // input
        for (int i=0;i<7;i++){
             Divyam[i]=sc.nextInt();
        }
       // Print
        for (int i=0;i<7;i++){
            System.out.print(Divyam[i]+" ");
        }

    }
}

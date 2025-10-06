package ArrayBasic;

public class Array01 {
    public static void main(String[] args) {
        int[] x={6,34,4,67,171,56};
        //Indaxing
        System.out.println(x[0]); //Access
        //Updating
        x[3]=7;
        System.out.println(x[3]);
        //new empty array
        int[] arr= new int[4];
        arr[0] =3;
        arr[1] =4;
        arr[2] =5;
        arr[3] =6;
        System.out.println(arr[3]);
        //all element printing at same time
        for(int i=0; i<=3;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

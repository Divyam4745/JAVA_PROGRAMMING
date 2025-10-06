package ArrayBasic;

public class Maximum_Element {
    public static void main(String[] args) {
        int arr[]={-41,23,45,56,3,-6,-71};
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max) max=arr[i];
        }
        System.out.print(max);
    }
}

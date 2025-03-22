public class arrReverse {
    public static void main(String[] args) {
        int arr[]={1,3,5,45,78,65,45};
        int n= arr.length;
        for(int i=0 ; i<n/2;i++){
            int temp = arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]= temp;

        }System.out.println("the reverse array");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

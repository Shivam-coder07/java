public class array2 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,2,1};
        int n = arr.length;
        for(int i =0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                System.out.println("Not a palidrome");
                break;
            }
            else{
                System.out.println("Palidrome");
            }
        }
    }
}

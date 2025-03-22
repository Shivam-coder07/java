public class arrMissing {
    public static void main(String[] args) {
        
        int arr[]= {1,3,5,4,2,9,8,7};
        int n= arr.length;
        int sum=0;

        int sum_natutal_number=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
        }
        System.out.println(sum_natutal_number-sum);

    }
}

public class DuplicateNumber {
    public  static void main(String [] args){
        int arr []={2,4,5,5,6,7,7};
        int n= arr.length;
        for (int i=0; i<n;i++){
            for (int j=i+1; j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Dublicate array " + arr[i]);
                }
            }
        }
    }
}

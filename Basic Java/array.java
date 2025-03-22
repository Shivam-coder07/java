public class array {
    public static void main(String[] args) {
        int arr[][]= new int[3][2];
      arr[0][0]=50;
        arr[0][1]=64;
        arr[1][0]=54;
        arr[1][1]=77;
        arr[2][0]=36;
        arr[2][1]=54;
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
       
    }
}

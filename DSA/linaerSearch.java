import java.util.*;

public class linaerSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        // no of elements from user
        System.out.println("Enter the no of elements in the array");
        int n=in.nextInt();
        // entering the value in array
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        //searching the target value
        int x= in.nextInt();
        int idx=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                idx=i;
                break;
            }
        }
        if(idx ==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("the element is found "+idx);

        }

    }
}

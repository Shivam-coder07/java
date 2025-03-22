import java.util.*;
public class recursionFibonacci{
    // function definition
    public static int fibonacci(int n){
        // base case condition
        int result=0;
        if(n<=1){
            return n;
        }
        // recursive call
        
        else{
            result =fibonacci(n-1)+fibonacci(n-2);
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number in fibonacci series");
        int n= sc.nextInt();
        // function calling
        int result= fibonacci(n);
        System.out.println(result);


    }
}

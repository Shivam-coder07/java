import java.util.*;

public class recursionFactorial{
    public static int factorial(int n){
        int result;
        // base case condition
        if(n==0 || n==1){
            return 1;
        }
        else{
            result=n*factorial(n-1);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n= sc.nextInt();
        // function calling
        int result= factorial(n);
        System.out.println("the factorial of no is:"+result);
    }
}
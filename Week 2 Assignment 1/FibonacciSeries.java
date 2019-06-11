import java.util.*;
public class FibonacciSeries{
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth term");
		n = sc.nextInt();
		System.out.println("Fibonacci Series of "+n+" is");
		for(int i = 0; i < n; i++){
			System.out.println(fibo(i)+" ");
		}
    }
    public static int fibo(int num){
    	if(num == 0)
    		return 0;
    	else if(num == 1)
    		return 1;
    	else
    		return(fibo(num - 1) + fibo(num - 2));
    }
}
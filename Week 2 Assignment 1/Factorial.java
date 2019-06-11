public class Factorial{
	public static void main(String[] args) {
		int num = 4;
		int result = factorial(num);
		System.out.println("The factorial of 4 is "+result);
    }
    public static int factorial(int num){
    	if(num == 0){
    		return 1;
    	}
    	else if(num == 1){
    		return 1;
    	}
    	else{
    		return factorial(num - 1)*num;
    	}
    }
}
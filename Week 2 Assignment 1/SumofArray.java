public class SumofArray{
	public static void main(String[] args) {
		int[] array = {3,4,2,7,9};

		int sum = Sum(array,array.length);
		System.out.println("The sum is " +sum);
	}
	public static int Sum(int array[], int n){
		if(n <= 0){
			return 0;
		}
		return Sum(array,n-1) + array[n-1];

    }
}
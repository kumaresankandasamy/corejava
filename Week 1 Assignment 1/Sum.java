public class Sum{
	public static void main(String[] args) {
		int[] array = {12,23,1,23,5,6,67};
		int sum = 0;
		for(int num : array){
			sum=sum+num;
		}
	System.out.println("Total sum of array"+sum);
	}
}
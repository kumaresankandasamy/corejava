public class Secondlargestnum{
	public static void main(String[] args) {
		int array[] = {4,56,12,34,24,46,77,89};
		int largest = array[0];
		int secondlargest = array[0];
		System.out.println("Given array is:");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]+"\t");

		}
		for(int i=0;i<array.length;i++){
			if(array[i] > largest){
				secondlargest = largest;
				largest = array[i];
			}
			else if(array[i] > secondlargest){
				secondlargest = array[i];
			}
		}
		System.out.println("Second largest number is: "+secondlargest);

	}
}
public class LargestSmallest{
	public static void main(String[] args) {
		int array[] = new int[] {2,34,12,29,5,6,67,45};
		int largest = array[0];
		int smallest = array[0];
		for(int i=1;i<array.length;i++){
			if(array[i] > largest)
				largest = array[i];
			
			else if(array[i] < smallest)
				smallest = array[i];
			
		}
		System.out.println("Largest number is: "+largest);
		System.out.println("Smallest number is: "+smallest);
	}
}
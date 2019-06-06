public class ReverseArray{
	public static void main(String[] args) {
		int array[]={4,23,1,12,67};
		System.out.println("Array before reverse:");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");

		}
		for(int i=0;i<array.length/2;i++){
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 -i] = temp;

		}
		System.out.println("\n Array after reverse:");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
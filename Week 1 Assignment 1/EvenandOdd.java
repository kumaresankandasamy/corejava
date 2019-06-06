public class EvenandOdd{
	public static void main(String[] args) {
		int array[] = {4,5,12,34,24,53,77,89};
		System.out.println("Odd Numbers:");
		for(int i=0;i<array.length;i++){
			if(array[i]%2 != 0){
				System.out.println(array[i]);
			}
		}
		System.out.println("Even Numbers:");
		for(int i=0;i<array.length;i++){
			if(array[i]%2 ==0){
				System.out.println(array[i]);
			}
			
		}
	}
}
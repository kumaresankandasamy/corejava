public class FirstRepeatingNum{
	public static void main(String[] args) {
		int[] array = {3,4,56,2,56,6,78,2};
		int count=0;
		for(int i =0 ;i < array.length; i++){
			for(int j=0; j <array.length; j++){
				if(array[i] == array[j]){
					count++;
				}
			}
				if(count > 1){
					System.out.println(array[i]);
					break;
				}
				count = 0;
		}
	}
}
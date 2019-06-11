public class ReverseArrayofNumbers{
	public static void main(String[] args) {
		int[] array = {3,4,6,7,9};
		int length = array.length;
		int[] revArray = reverseArray(array,0,length-1);
		for(int i : revArray){
			System.out.print(i+"  ");
		}
	}
	public static int[] reverseArray(int[] a,int i,int j){
		if(i<j){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			reverseArray(a,i+1,j-1);
		}
		return a;
	}
}
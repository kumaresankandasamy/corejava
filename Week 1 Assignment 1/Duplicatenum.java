public class Duplicatenum{
    public static void main(String[] args) {
        int[] array={ 4,56,2,34,56,4,78,99,56};
        System.out.println("Duplicate elements in given array:");
        int count=0;
        for(int i = 0;i<array.length;i++){
            for(int j = i+1;j<array.length;j++){
                if(array[i]==array[j])
                    count++;
                if(count==1){
                    System.out.println(array[j]);
                    count=0;
                }
            }
        }
        
    }
}
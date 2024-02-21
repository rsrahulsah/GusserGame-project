public class Reversal_of_array_program {
    public static void main(String[] args) {
        int array[]={4,5,7,8,9,4,5,6,2,10};
        int n=array.length;
        for(int i=0; i<n/2; i++){
            int temp=array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=temp;
        }
        System.out.println("The reversal of an array are : ");
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}

public class Duplicate_number_In_Array {
    public static void main(String[] args) {
        int array[]={4,5,6,7,7,8};
        int n=array.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(array[i]==array[j]){
                    System.out.println("duplicate number found : "+array[i]);
                }

            }
        }

    }
}

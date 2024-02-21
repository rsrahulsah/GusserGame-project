public class Missing_number_In_Array {
    public static void main(String[] args) {
        int array[]={1,2,4,6,5,8,7};
        int n=array.length;
        int sum_of_Natural_num=((n+1)*(n+2))/2;
        int sum=0;
        // sum of current element present in the array
        for(int i=0; i<n; i++){
            sum+=array[i];
        }
        int missing_element=0;
        missing_element=sum_of_Natural_num-sum;
        System.out.println("missing number of an array are : "+missing_element);
    }
}

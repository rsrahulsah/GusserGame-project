public class palindrome_program {
    public static void main(String[] args) {
        int array[]={1,2,3,7,1};
        int n=array.length;
        int flag=0;
        for(int i=0; i<n/2; i++){
            if(array[i]!=array[n-i-1]){
                flag=1;
                System.out.println("This is not a palindrome array");
                break;
            }
        }
        if(flag==0){
            System.out.println("This is palindrome array");
        }
    }
}
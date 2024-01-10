import java.util.Arrays;

class REV{
    public static void main(String[] args) {
        String []arr={"N","a","v","e","e","n"};
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
           String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));


    }
}
public class lin {
    public static int search (int[]arr, int s) 
    {for(int i=0;i<=arr.length;i++){
       if(arr[i]==s){
        return i;
       }
    }
    return -1;
}
     
    public static void main(String[] args) {
        int[]arr={1,5,6,7,8,9,5};
        int s=5;
        System.out.println(search(arr,s));
    }
    }
    


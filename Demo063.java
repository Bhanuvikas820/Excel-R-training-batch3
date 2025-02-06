public class Demo063 {
    public static void main (String[] args){
        int [] arr = {1, 2, 3, 4, 5};
        int i = addArray(arr);
        System.out.println("Sum of the 1st and last element of an array: "+i);
 
    }
    static int addArray(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        else{
            return arr[0] + arr[arr.length - 1];
        }
    }

}

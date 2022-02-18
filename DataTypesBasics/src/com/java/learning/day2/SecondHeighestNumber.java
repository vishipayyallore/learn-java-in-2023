import java.io.*;
import java.util.Arrays;

class SecondHeighestNumber {
    public static void main(String[] args) {
        // int[] arr = { 13, 7, 6, 102, 21, 9, 101, 102 };
        int[] arr = { 102, 102, 102, 102, 102, 102, 102, 102 };
        boolean found = false;
        
        System.out.println(Arrays.toString(arr));
  
        // Applying sort() method over to above array by passing the array
        Arrays.sort(arr);
  
        // Printing the array after sorting
        System.out.println("\n" + Arrays.toString(arr));
        int maxItem = arr[arr.length-1];
        
        for(int i=arr.length-2; i>0; i--){
            if( arr[i] == maxItem){
                continue;
            }
            
            System.out.println(arr[i]);
            found = true;
            break;
        }
        
        if(!found){
            System.out.println("All elements in the array are same");
        }
    }
}

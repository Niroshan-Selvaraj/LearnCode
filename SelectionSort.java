import java.util.*;
public class SelectionSort{

    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        int iMin = 0;
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
           iMin = i;
           for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[iMin])
                iMin =j;
           }
           temp = arr[i];
           arr[i] = arr[iMin];
           arr[iMin] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
import java.util.*;
public class max {
    public static void main(String[] args) {
        int arr[]={8,9,7,1,2};
        int n=arr.length;
        Arrays.sort(arr);
       // int max = arr[n];
        System.out.println("maximum element:" + arr[n-1]);
    }

}

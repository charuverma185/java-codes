import java.util.*;
public class span {
    public static void main(String[] args) {
        int arr[]={4,8,9,1,7,5};
        int n=arr.length;
        Arrays.sort(arr);
        int span=arr[n-1]-arr[0];
        System.out.println("The Differnce between element:" + span);
    }
    
}

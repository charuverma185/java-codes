import java.util.*;
public class secondmax {
    public static void main(String[] args) {
        int arr[]={1,4,6,9,4,8};
        int t=0;
        int n=arr.length;
        Arrays.sort(arr);
        do{
            if(arr[n-2]<arr[n-1]){
                t=1;
                System.out.println("Second max num:" + arr[n-2]);
            }
            else{
                n--;
            }
        }while(t==0);
    }
}

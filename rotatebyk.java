import java.util.*;
public class rotatebyk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int j=size-1;
        for(int i=0;i<k;i++){
            int r=arr[i];
            arr[i]=arr[j];
            arr[j]=r;
            j--;
        }
        for(int i=0;i<size;i++){
            System.out.println("rotaye array:" + arr[i]);
        }
    }
}

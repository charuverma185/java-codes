import java.util.Arrays;

public class Majorityelement {
    public static void main(String[] args) {
        
        //time complexityo(n),space complexiity o(1)
        //skill risers,
        //blogs.bringmentors
        //gitwith all question
        int arr[]={5,3,3,3,9,9,2,2,2,2,7};
        int n=arr.length;
        int num[]=new int[n];
        int count=arr[0];
        int r=0;
        int m=0;
        for(int i=0;i<n;i++){
            r=m;
            m=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    m++;
                    if(m>r){
                        count=arr[i];
                    }
                }
                num[i]=m;
            }
        }
        Arrays.sort(num);
        System.out.println("majority element is:"+count);
    }
}

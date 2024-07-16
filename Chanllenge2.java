import java.lang.foreign.SequenceLayout;
import java.util.HashMap;

public class Chanllenge2 {
    public static void main(String[] atgs){
        int[] arr={34,65,78,1,-222,0};
        int max=-1;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            //max=Math.max(arr[i],max);
            //smallest=Math.min(arr[i],smallest);
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];

            }
        }
        System.out.println(max+" "+smallest);
        System.out.println(Slargest(arr,max));
        Ssmallest(arr);
    }
    public static String  Slargest(int[] arr,int max){
        int slargest=-1;
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest) {
                slargest = largest;
                largest = arr[i];
            }
        }
        return slargest+" "+largest;
    }
    public static void Ssmallest(int[] arr){
        int Ssmallest=-1;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest) {
                Ssmallest = smallest;
                smallest = arr[i];
            }
        }
        System.out.println(Ssmallest+" "+smallest);
    }

}

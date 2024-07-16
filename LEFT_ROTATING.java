import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class LEFT_ROTATING {
    public static void main(String[] args){
        //1
        int[] a ={3,4,5,6,8};
        int temp=a[0];
        for(int i=0;i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        System.out.println(Arrays.toString(a));
        //2
        String reult=rotate_array_left(a,5,2);
        System.out.println(reult);


    }
   public static @NotNull String rotate_array_left(int[] arr, int n, int d) {
        d = d % n; // adjust d if it's greater than n
        int temp[]=new int[d];
        for(int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for(int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }
        for(int i = n - d; i < n; i++) {
            arr[i] = temp[i - n + d];
        }
        return Arrays.toString(arr);
    }
}

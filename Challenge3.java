import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public  class Challenge3 {
    public static void main(){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arr2={1,2,3,1,2,3,4,5,6,7,8,9};
        int k=10;
        Brute_Force(arr,k);
        remove_duplicate(arr2);
    }
    //two sum
    public static void Brute_Force(int @NotNull [] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++) {
                int result = arr[i] + arr[j];
                if (result == target) System.out.println(STR."\{arr[i]} \{arr[j]}");
            }
        }
    }
    //write a program to remove duplicates
    public static void remove_duplicate(int[] arr){
     /*   ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i< arr.length;i++){
            if(!res.contains(arr[i])){
                res.add(arr[i]);
            }
        }
        System.out.println(res);*/


        //2
       /*int[] result = new int[arr.length]; boolean b=true;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    b=false;
                    break;
                }
            }
            if(b){
                result[i]=arr[i];
            }
        }
        System.out.println(Arrays.toString(result));*/


        //3
        int[] result;
        int count=0;
        for(int i=0;i< arr.length;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]&& arr[i]!=-1) {
                    arr[j] = -1;
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
            int len= arr.length-count;
            result=new int[len];
            int m=0;
            for(int i=0;i< arr.length;i++){
                if(arr[i]!=-1 && m<=len){
                    result[m]=arr[i];
                    m++;
                }
            }
        System.out.println(Arrays.toString(result));

    }


}




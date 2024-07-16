//public class Coin {
//    public static void main(String[] args){
//        int[] arr={5,5,5};
//        int k=28;
//        count_denomination(k,arr);
//    }

//    public static void count_denomination(int target,int[] arr){
//        int total=1*arr[0]+2*arr[1]+5*arr[2];
//        int tar5=target%arr[2];
//        if(target%arr[2]<=(arr[1]*2)){
//            if(tar5%2==0){
//                int i = arr[1] * 2;
//                if(tar5<=i){
//                    System.out.println("it is possible");
//                }
//                else{
//                    System.out.println("it is not possible");
//                }
//            }
//            else{
//                int i= tar5%2;
//                if(i<=arr[3]*5){
//                    System.out.println("It is possible");
//                }else{
//                    System.out.println("it is not possible");
//                }
//
//            }
//        }
//    }
//}
public class Coin {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5}; // arr[0] = number of 1s, arr[1] = number of 2s, arr[2] = number of 5s
        int k = 28;
        count_denomination(k, arr);
        coin_count(arr,k);
    }

    public static void count_denomination(int target, int[] arr) {
        int count1 = arr[0];
        int count2 = arr[1];
        int count5 = arr[2];

        // Try using maximum possible 5s
        for (int i = 0; i <= count5; i++) {
            int remainingAfter5s = target - (i * 5);
            if (remainingAfter5s < 0) break; // If we exceed target, no need to continue with more 5s

            // Try using maximum possible 2s for the remaining amount
            for (int j = 0; j <= count2; j++) {
                int remainingAfter2s = remainingAfter5s - (j * 2);
                if (remainingAfter2s < 0) break; // If we exceed the remaining amount, no need to continue with more 2s

                // Check if we can fulfill the remaining amount with 1s
                if (remainingAfter2s <= count1) {
                    System.out.println("It is possible");
                    return;
                }
            }
        }

        // If no combination works
        System.out.println("It is not possible");
    }

    public static  void coin_count(int[] arr,int k){
//        int count1=arr[0];
//        int coutn2=arr[1];
//        int count5=arr[2];
//        int total=arr[0]+2*arr[1]+5*arr[2];
//
//        int commcount=0;
//        if(total>=k) {
//            for (int i = 0; i < count5 && k % 5 == 0; i++) {
//                commcount++;
//                k = k - 5;
//            }
//            System.out.println(commcount);
//            for (int i = 0; i < coutn2 && k % 2 == 0; i++) {
//                commcount++;
//                k = k - 2;
//            }
//            System.out.println(commcount);
//            for (int i = 0; i < count1 && k % 1 == 0; i++) {
//                commcount++;
//                k = k - 2;
//            }
//            System.out.println(commcount);
//        }else {
//            System.out.println("No possible");
//        }

        int total=arr[0]+2*arr[1]+5*arr[2];
        int commcount=0;
        if(total>=k){
            commcount+=arr[2];
            k = k % 5;
            if(k!=0){

            }
        }
        else{
            System.out.println("no possible");
        }
        System.out.println(k+" "+commcount);

    }
}


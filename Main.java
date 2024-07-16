import java.util.Arrays;

public class Main{
    /*write a program to merge two arrays
    public  static void main(String[] args){
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7};
        int k=0;
        int count=arr1.length+arr2.length;
        int[] result=new int[count];
        for(int j=0;j<count;j++) {
            if(j< arr1.length)
                result[j] = arr1[j];
            else
                result[j]=arr2[k++];// k++  <===>  j-arr1.length
            }
        System.out.println(Arrays.toString(result));
    }*/

    //public static void main(String[] args){
    //
    //   int[] arr1={1,2,3,4,5,7,8,9,11,13};
    //   System.out.println(arr1[arr1.length-1]);
    //   int k=1;
    //   for(int i=0;i<arr1[arr1.length-1];i++){
    //       if(arr1[i]!=k){
    //           System.out.println(i);
    //       }
    //       k++;
    //   }


    public static void main(String[] args){
        //Prime p=new Prime();
        //p.set_number(5);
        //System.out.print(p.get_number());
        //Get_Set_Sim[] gm=new Get_Set_Sim[];
        Get_Set_Sim gm1=new Get_Set_Sim();
        Get_Set_Sim gm2=new Get_Set_Sim();
        Get_Set_Sim gm3=new Get_Set_Sim();
        gm1.setSim_no(9345623263L);
        gm2.setSim_no(8903151965L);
        gm3.setSim_no(1234567897L);
        gm1.setSim_provider("Jio");
        gm2.setSim_provider("AIRTEL");
        gm3.setSim_provider("IDEA");
        System.out.println("*********************");
        gm1.displaySimInfo();
        System.out.println("*********************");
        gm2.displaySimInfo();;
        System.out.println("*********************");
        gm3.displaySimInfo();

        gm3.setSim_no(9486291316L);
        gm3.setSim_provider("JIO");
        System.out.println("*********************");
        gm1.displaySimInfo();
        System.out.println("*********************");
        gm2.displaySimInfo();;
        System.out.println("*********************");
        gm3.displaySimInfo();

    }
}

import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n+1;i++){
            for(int j=1;j<=10;j++){
                if(j%2==0)
                System.out.println(i+" * "+j+" ="+(i*j));
            }
            System.out.println("------------------------------");
        }
    }
}

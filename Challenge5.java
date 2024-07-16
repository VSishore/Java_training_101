public class Challenge5 {
    void main(){
        Bank b=new Bank();
        System.out.println("------------------------------------");
        b.search(271);
        System.out.println("------------------------------------");
        b.search(271,"Kishore","600001");
        System.out.println("------------------------------------");
        b.search(277,"LOKESHKUMAR");
        System.out.println("------------------------------------");
        b.search("AJAI");
    }

}
class Account{
    long acc_no;
    String acc_holder_name;
    String ifsc;
    Account(long acc_no,String acc_honlder,String ifsc){
        this.acc_holder_name=acc_honlder;
        this.acc_no=acc_no;
        this.ifsc=ifsc;
    }
    public static void display(long acc_no,String acc_holder_name,String ifsc){
        System.out.println("The account number: " + acc_no);
        System.out.println("The Account nmae: " + acc_holder_name);
        System.out.println("the IFSC Code: " + ifsc);
    }
}
class Bank{
//    Account[] a=new Account[Integer.MAX_VALUE];
//    int count=0;
//
//    public void addAccount(Account account) {
//            a[count] = account;
//            count++;
//            System.out.println("Account added successfully.");
//        }
//    public void removeAccount(int index) {
//        if (index >= 0 && index < count) {
//            for (int i = index; i < count - 1; i++) {
//                a[i] = a[i + 1];
//            }
//            a[count - 1] = null;
//            count--;
//            System.out.println("Account removed successfully.");
//        } else {
//            System.out.println("Invalid position.");
//        }
//    }
//    public boolean isempty(){
//        return count==0;
//    }
    Account[] a={new Account(271,"Kishore","600001"),new Account(277,"LokeshKumar","600069"),new Account(231,"Ajai","600079")};
    void search(long acc_no){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i].acc_no==acc_no) {
                Account.display(a[i].acc_no,a[i].acc_holder_name,a[i].ifsc);
                count++;
                break;
            }

        }
        if(count==0){
            System.out.println("Accout not found");
        }
    }
    void search(long acc_no,String acc_holder_name){
        int count=0;
        for(int i=0;i<a.length;i++) {
            if (a[i].acc_no == acc_no && a[i].acc_holder_name.equalsIgnoreCase(acc_holder_name)) {
                Account.display(a[i].acc_no,a[i].acc_holder_name,a[i].ifsc);
                count++;
                break;
            }
        }if(count==0) {
            System.out.println("Account not found");
        }

    }
    void search(String acc_holder_name){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i].acc_holder_name.equalsIgnoreCase(acc_holder_name)){
                Account.display(a[i].acc_no,a[i].acc_holder_name,a[i].ifsc);
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Account not found");
        }
    }
    void search(long acc_no,String acc_holder_name,String ifsc){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i].acc_no==acc_no && a[i].acc_holder_name.equalsIgnoreCase(acc_holder_name) && a[i].ifsc.equalsIgnoreCase(ifsc)){
                Account.display(a[i].acc_no,a[i].acc_holder_name,a[i].ifsc);
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Accout not found");
        }
    }
    }




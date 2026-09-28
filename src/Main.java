import javax.swing.plaf.basic.BasicLabelUI;
import java.util.*;
abstract class Account{
    abstract void  Withdraw();
//    abstract void CurrentAccount();
}
class Bank{
    private int AccountNo;
    private String Name;
    private String IfcPin;
    private double Balance;
    Bank(int AccountNo,String Name, String IfcPin,double Balance){
        this.AccountNo=AccountNo;
        this.Name=Name;
        this.IfcPin=IfcPin;
        this.Balance=Balance;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    public void setAccountNo(int AccountNo){
        this.AccountNo=AccountNo;
    }
    public int getAccountNo(){
        return AccountNo;
    }
    public void setIfcPin(String IfcPin){
        this.IfcPin=IfcPin;
    }
    public String getIfcPin(){
        return IfcPin;
    }
    public void setBalance(double Balance){
        this.Balance=Balance;
    }

    public double getBalance() {
        return Balance;
    }
}
class Customer extends Bank{

    Customer(int AccountNo, String Name, String IfcPin,double Balance) {
        super(AccountNo, Name, IfcPin, Balance);
    }

    void display() {
        System.out.println("Account Holder Name: "+getName());
        System.out.println("Account No         : "+getAccountNo());
        System.out.println("Ifc Code           : "+getIfcPin());
    }
    public double  Withdraw(long amount){
        double balnce=getBalance();
        if(balnce>amount){
            balnce-=amount;
            System.out.println("Your Amount has Successfully Withdrawn Your Current Balance is:");
            setBalance(balnce);
            return balnce;
        }
        return balnce;
        //return balnce;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
     Customer customer=new Customer(12345,"Prem","SBIAf2336",2000);
     customer.display();
        System.out.println("Enter your Options :\n" +
                "1.Chack Balance\n" +
                "2.Withdraw\n" +
                "3.exit()");
        int n=scanner.nextInt();
     switch (n){
         case 1:
             System.out.println(customer.getBalance());
             break;
         case 2:
             System.out.println("Is Your Account is Savings type ae not enter 1/0");
             int x=scanner.nextInt();
             if(x==1){
                 System.out.println("Enter Your Amount you wanted withdraw :");
                 long amount=scanner.nextLong();
                 double Actual_Balance = customer.Withdraw(amount);
                 System.out.println(Actual_Balance);
             }
             else if(x==0){
                 long amount=scanner.nextLong();
                 double current_Account_Balance=customer.Withdraw(amount);
             }
     }
    }
}
public class BankignProject {

    String bank_name;
    long account_number;
    double Balance;
    String customer_name;
    int phone_number;

    public BankignProject(String bank_name, long account_number, double balance, String customer_name, int phone_number) {
        this.bank_name = bank_name;
        this.account_number = account_number;
        this.Balance = balance;
        this.customer_name = customer_name;
        this.phone_number = phone_number;
    }

    public  void Deposit_Money (double DepositedMoney){
        this.Balance+=DepositedMoney;
        System.out.println("Succeesfull Deposit"+"Now current value is  "+this.Balance);


    }

    public void Withdraw_MOney (Double Withdrawal_Money){
        if (this.Balance-Withdrawal_Money<0){
            System.out.println("Sorry Balance Not Enough");
        } else if (this.Balance ==0) {
            System.out.println("Sorry on money available your acount");
        }else {
            this.Balance-=Withdrawal_Money;
            System.out.println("Successfully Debited now your current balance is "+this.Balance);
        }
    }



    public static void main(String[] args) {
 BankignProject bb = new BankignProject("State Bank Of India",123039483839L,1000,"Sankha Talukdar",1212121);

       bb.Withdraw_MOney(500d);
       bb.Deposit_Money(2535);
       bb.Deposit_Money(2800);
       bb.Withdraw_MOney(5000d);
       bb.Withdraw_MOney(1000d);
        System.out.println(bb.bank_name);
    }
}
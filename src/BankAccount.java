public class BankAccount {
    private int _accountNumber;
    private double _balance;
    private String _ownerName;

    public void setAccountNumber(int accountNumber){
        _accountNumber= accountNumber;
    }
    public void setBalance(double balance){
        _balance= balance;
    }
    public void setOwnerName(String ownerName){
        _ownerName= ownerName;
    }
    public int getAccountNumber(){
        return _accountNumber;
    }
    public double getBalance(){
        return _balance;
    }
    public String getOwnerName(){
        return _ownerName;
    }
    public void deposit(double amount){
        if(amount >0){
            _balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(_balance >=amount){
            _balance-=amount;
        } else {
            System.out.println("Недостаточно средств");
        }
    }


    public void printAccountInfo(){
        System.out.println("Account Number: "+ _accountNumber);
        System.out.println("Balance: "+ _balance);
        System.out.println("Owner Name: "+ _ownerName);
    }
}

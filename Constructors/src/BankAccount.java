//public class BankAccount {
//    private int accountNumber;
//    private int balance;
//    private String customerName;
//    private String email;
//    private String phoneNumber;
//
//
//    public BankAccount(){
//        this(0001, 0, "First Last", "defualt@user.com", "(888)-888-8888");
//    }
//    public BankAccount (int accountNumber, int balance, String customerName, String email, String phoneNumber){
//this.accountNumber = accountNumber;
//this.balance = balance;
//this.customerName = customerName;
//this.email = email;
//this.phoneNumber = phoneNumber;
//    }
//    //setters
//    public void setAccountNumber (int newAccountNumber){
//        accountNumber = newAccountNumber;
//    }
//    public void setBalance (int newBalance){
//        balance = newBalance;
//    }
//    public void setCustomerName (String newCustomerName){
//        customerName = newCustomerName;
//    }
//    public void setEmail (String newEmail){
//        email = newEmail;
//    }
//    public void setPhoneNumber (String newPhoneNumber){
//        phoneNumber = newPhoneNumber;
//    }
//    //getters
//    public int getAccountNumber (){
//        return this.accountNumber;
//    }
//    public int getBalance (){
//        return this.balance;
//    }
//    public String getCustomerName (){
//        return this.customerName;
//    }
//    public String getEmail (){
//        return this.email;
//    }
//    public String getPhoneNumber (){
//        return this.phoneNumber;
//    }
//    //additional operations
//    public void depositMoney (int deposit){
//        balance += deposit;
//        System.out.println("Your new balance is: $" + balance);
//    }
//    public void withdrawMoney (int withdraw){
//        if (balance - withdraw >= 0){
//            balance -= withdraw;
//            System.out.println("Your new balance is: $" + balance);
//        }
//        else {
//            System.out.println("Insufficient Funds");
//        }
//    }
//}

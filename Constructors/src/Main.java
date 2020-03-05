public class Main {
    public static void main(String[] args) {

//        BankAccount userAccount = new BankAccount();
//        //BankAccount userAccount = new BankAccount(1009, 50, "John White", "jwhite@gmail.com", "804-912-0238");
//
// Testing...
//        System.out.println("Account #: " + userAccount.getAccountNumber());
//        System.out.println("Initial Balance: " + userAccount.getBalance());
//        System.out.println("Name: " + userAccount.getCustomerName());
//        System.out.println("Email: " + userAccount.getEmail());
//        System.out.println("Phone: " + userAccount.getPhoneNumber());

// new object Vip Customer with testing...

        VipCustomer person1 = new VipCustomer();

        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmail() + "\n");


        VipCustomer person2 = new VipCustomer("Joe");

        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmail() + "\n");


        VipCustomer person3 = new VipCustomer("Bob", 2500);

        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmail() + "\n");


        VipCustomer person4 = new VipCustomer("David Guy", 77, "dguywhy@gmail.com");

        System.out.println(person4.getName());
        System.out.println(person4.getCreditLimit());
        System.out.println(person4.getEmail() + "\n");



    }
}

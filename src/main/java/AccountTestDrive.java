public class AccountTestDrive {
    public static void main(String[] args) {
        Account cathalsAccount = new Account("Cathal Aherne", 34);
        Account tomsAccount = new Account("Jack Jones", 64);

        Bank bank = new Bank(cathalsAccount);
        Bank bank1 = new Bank(tomsAccount);

        //when salary is credited into Account(Observable),Bank(Observer) will be notified
        cathalsAccount.setSalary(40000);
        tomsAccount.setSalary(40000);
    }
}
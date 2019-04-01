import java.util.Observable;
import java.util.Observer;

public class Bank implements Observer {

    Observable account;

    public Bank(Observable account) {
        this.account = account;
        account.addObserver(this);
    }

    // This is the method which notifies the observed accounts that a change has been made
    @Override
    public void update(Observable account, Object object) {
        if(account instanceof Observable){
            Account salaryAccount = (Account) account;
            if(salaryAccount.getSalary() > 0){
               ((Account) account).handleNotification(salaryAccount.getSalary());
            }else{
                System.out.println("Account doesn't have sufficient balance for emi deduction");
            }
        }
    }

}

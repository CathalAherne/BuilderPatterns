import java.util.Observable;

public class Account extends Observable {
    float salary;
    String name;
    int age;

    public Account(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setSalary(float salary) {
        this.salary = salary;
        salaryCredited();
    }

    public void salaryCredited(){
        setChanged();
        if (age < 60){
            notifyObservers();
        }
    }

    public float getSalary() {
        return salary;
    }

    public void handleNotification(float amount){
        System.out.println("Hello " + this.name + ", We just wanted to notify you that " +
                + amount + " has been credited to your account.");
    }

}
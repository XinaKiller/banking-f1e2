public class Account {

    private String name;
    private int age;
    private float balance;
    private int nr_children;


    public Account(String name, int age, float balance, int nr_children) {
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.nr_children = nr_children;
    }

    public String getClientName() {
        return this.name;
    }

    public int getClientAge() {
        return this.age;
    }

    public float getClientBalance() {
        return this.balance;
    }

    public int getClientNrChildren() {
        return this.nr_children;
    }

    public void setClientName(String new_name) {
        this.name = new_name;
    }

    public void setClientAge(int new_age) {
        this.age = new_age;
    }

    public void setClientBalance(float new_balance) {
        this.balance = new_balance;
    }

    public void setClientNrChildren(int new_nrchildren) {
        this.nr_children = new_nrchildren;
    }

    public void deposit(float amount) {
        this.balance += amount;
    }

    public void withdraw(float amount) {
        this.balance -= amount;
    }
}

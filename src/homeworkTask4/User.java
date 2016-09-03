package homeworkTask4;

/**
 * Created by Юрий on 03.09.2016.
 */
public class User {
    private String name;
    private int balance;
    private int startOfEmploiment;
    private String CompanyName;
    private int salary;
    private String currency;

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setStartOfEmploiment(int startOfEmploiment) {
        this.startOfEmploiment = startOfEmploiment;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getStartOfEmploiment() {
        return startOfEmploiment;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public User(String name, int balance, int startOfEmploiment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.startOfEmploiment = startOfEmploiment;
        CompanyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary(){
        setSalary(salary);

    }
    //Короче я дальше ни фига не понимаю


    }



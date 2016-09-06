package homeworkTask4;

import java.time.Month;

/**
 * Created by Юрий on 03.09.2016.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String CompanyName;
    private int salary;
    private String currency;


    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
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


    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
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

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        CompanyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary(){
        balance+=salary;

    }
   void withdraw(int summ){
       double comision = balance*0.05;
       double comision2= balance*0.1;

       if (summ<1000){
           balance -= comision;
       }else {
           balance-=comision2;
       }


    }
    void companyNameLength() {

        System.out.println(CompanyName.length());


    }
   void monthIncreaser(int addMonth){
       int month = addMonth + monthsOfEmployment;
   }

}



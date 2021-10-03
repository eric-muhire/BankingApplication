package com.bankingApplication;
public class BankAccount {

    private int balance;
    private int previousTransaction;
    private String customerName;
    private String custotmerId;




    public BankAccount(String customerName, int customerId) {
        this.customerName = customerName;
        this.custotmerId = custotmerId;

    }

    public BankAccount() {

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPreviousTransaction() {
        return previousTransaction;
    }

    public void setPreviousTransaction(int previousTransaction) {
        this.previousTransaction = previousTransaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustotmerId() {
        return custotmerId;
    }

    public void setCustotmerId(String custotmerId) {
        this.custotmerId = custotmerId;
    }

    public void deposit(int amount){
         if (amount!=0){
             balance =balance +amount;
             previousTransaction=amount;
         }

     }
     public void withdraw(int amount){
         if (amount!=0){
             balance =balance - amount;
             previousTransaction=-amount;
         }
     }
public void previousTransaction(int amount){
         if (previousTransaction>0){
             S.o("deposited: " + previousTransaction);
         }
         else if(previousTransaction<0){
             S.o("withdraw: " + Math.abs(previousTransaction));
         }
         else {
             S.o("No transaction occured");
         }
}

}

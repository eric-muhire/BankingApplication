public class BankAccount {

     int balance;
     int previousTransaction;
     String customerName;
     String custotmerId;


     BankAccount(String customerName, String custotmerId) {
        this.customerName = customerName;
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

public class BankAccount {
    //Ex 5
   public void deposit(int sumToDeposit){
       balance += sumToDeposit;
       System.out.println( " Balansul este " + balance);
   }
   public void withdraw(int sumToWithdrawn){}

    protected int balance = 0;

}


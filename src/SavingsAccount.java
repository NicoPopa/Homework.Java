public class SavingsAccount extends BankAccount{
    @Override
    public void withdraw( int sumToWithdraw) {
        if (balance < 100){
            System.out.println( " Soldul este sub limita de 100 de lei.");
            System.out.println( " Balansul curent este " + balance);
        }
        else {
            balance -= sumToWithdraw;
            System.out.println( " Balansul curent a devenit " + balance);
        }

    }
}

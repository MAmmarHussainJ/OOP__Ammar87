class BankAccount{
int bal;
int accnum;
BankAccount(int bal, int accnum){
this.bal=bal;
this.accnum=accnum;
}
public void checkBal(){
System.out.println(" Check bal :" + bal);
}
public void deposit(int amount){
bal += amount;
System.out.println(" Deposited bal is :" + bal);
}
public void withdraw(int amount){
if (amount <= bal){
bal -= amount;
System.out.println(" bal after withdrawn :" + bal);
}else{
System.out.println("Insufficient bal");
}
}
public static void main(String[] args){
BankAccount acc1 = new BankAccount(1000, 1);
BankAccount acc2 = new BankAccount(500, 2);
acc1.checkBal();
acc2.checkBal();

acc1.deposit(500);
acc1.checkBal();
acc2.deposit(1500);
acc2.checkBal();
acc2.withdraw(200);
acc2.checkBal();
}
}
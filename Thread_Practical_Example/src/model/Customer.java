package model;

public class  Customer implements Runnable {

    BankAccount bankaccount;

    public Customer(BankAccount bankaccount){
        this.bankaccount = bankaccount;
    }
    @Override
    public void run() {
        for(int i=1;i<=4;i++){
            withdraw(4000);
            if(bankaccount.getBalance()>=0){
                System.out.println("No Cash");
            }
        }
    }

    private synchronized void withdraw(int amount){
        if(bankaccount.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+ amount);

            try{
                Thread.sleep(500);
                bankaccount.setBalance(amount);
                System.out.println(Thread.currentThread().getName() + amount+ ",Remain:"+bankaccount.getBalance());

            }catch(InterruptedException e){
                System.out.println("Server Error!!");
            }


        } else{
            System.out.println("Your Balance is Less than request amount");
        }
    }
}

package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
class Main
{
    private static final  Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String accountholdername;
    int accountnumber;
    int balance;
    static Scanner scanner = new Scanner(System.in);


    Main(String accountholdername,int accountnumber,int balance)
    {

        this.accountholdername=accountholdername;
        this.accountnumber=accountnumber;
        this.balance=balance;
    }

    void deposit()
    {
        LOGGER.log(Level.INFO,"Enter the amount to be deposited");
        int amount=scanner.nextInt();
        balance=amount+balance;


    }
    public void withdraw()
    {
        LOGGER.log(Level.INFO,"Enter the amount to be withdrawn");
        int amountw=scanner.nextInt();
        if(amountw>balance)
        {
            LOGGER.log(Level.INFO,"Money can not be withdrawn");
        }
        else
        {
            balance=balance-amountw;
        }
    }
    public  void currentbalance()
    {
        LOGGER.log(Level.INFO,Integer.toString(balance),"Your account balance is :"+balance);
    }

}

class App
{
    private static final  Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void main( String[] args )
    {
        int service=1;
        int balance;
        String accountholdername;
        int accountnumber;
        Scanner sc = new Scanner(System.in);


            LOGGER.log(Level.INFO,"welcome to the bank");
            LOGGER.log(Level.INFO,"Enter the account holdername:");
            accountholdername=sc.next();
            LOGGER.log(Level.INFO,"Enter the account number:");
            accountnumber=sc.nextInt();
            LOGGER.log(Level.INFO,"Enter the amount:");
            balance=sc.nextInt();
            Main m = new Main(accountholdername,accountnumber,balance);
        while(service==1)
        {
            LOGGER.log(Level.INFO,"1.deposit 2.withdraw 3.currentbalance 4.quiet");
            LOGGER.log(Level.INFO,"Enter the choice: ");

            int choice=sc.nextInt();

            switch(choice)
            {

                case 1:
                    m.deposit();
                    break;
                case 2:
                    m.withdraw();
                    break;
                case 3:
                    m.currentbalance();
                    break;
                case 4:
                    service=0;
                    System.exit(1);
                    break;

                default:
                    LOGGER.log(Level.INFO,"Enter a valid choice");
                    break;
            }
            LOGGER.log(Level.INFO,"-------------------------------------------");
        }
    }
}

package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
class Main
{
    String accountholdername;
    int accountnumber;
    int balance=500;
    static Scanner scanner = new Scanner(System.in);


    Main(String accountholdername,int accountnumber)
    {

        this.accountholdername=accountholdername;
        this.accountnumber=accountnumber;
    }

    void deposit()
    {
        System.out.println("Enter the amount to be deposited ");
        int amount=scanner.nextInt();
        balance=amount+balance;


    }
    public void withdraw()
    {
        System.out.println("Enter the amount to be withdrawn");
        int amountw=scanner.nextInt();
        if(amountw>balance)
        {
            System.out.println("Money can not be withdrawn");
        }
        else
        {
            balance=balance-amountw;
        }
    }
    public  void currentbalance()
    {
        System.out.println("Your account balance is :"+balance);
    }

}

class App
{
    public static void main( String[] args )
    {
        int service=1;
        String accountholdername;
        int accountnumber;
        Scanner sc = new Scanner(System.in);
        while(service==1)
        {

            System.out.println("welcome to the bank");
            System.out.println("Enter the account holdername:");
            accountholdername=sc.next();
            System.out.println("Enter the account number:");
            accountnumber=sc.nextInt();
            System.out.println("1.deposit 2.withdraw 3.currentbalance 4.quiet");
            System.out.println("Enter the choice: ");
            int choice=sc.nextInt();
            Main m = new Main(accountholdername,accountnumber);
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
                    System.out.println("Enter a valid choice");
                    break;
            }
            System.out.println("-------------------------------------------");
        }
    }
}

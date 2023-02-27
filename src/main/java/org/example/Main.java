package org.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Main
{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
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
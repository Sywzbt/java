package com.company;

import java.util.Scanner;

public class cashApp {

    String number;
    int bouns;
    int balance;
    cashApp(String number, int balance, int bouns) {
        this.number = number;
        this.balance = balance;
        this.bouns = bouns;
    }
    void store ( int money){
        this.balance += money;
        exchage(money);
    }

    void exchage ( int bouns){
        this.bouns += bouns / 1000;
    }


    public static void main(String[] args){
        cashApp[] cards = {
                new cashApp("A001", 500, 0),
                new cashApp("A002", 400, 0),
                new cashApp("A003", 300, 0)
        };
        Scanner scn = new Scanner(System.in);
        for (cashApp card:cards){
            System.out.print("目前適用者編號:" + card.number + "目前帳戶有" + card.balance + "元 紅利點數" + card.bouns +"點，請儲值:");
            card.store(scn.nextInt());
            System.out.print("儲值明細:目前適用者編號:" + card.number + "目前帳戶有" + card.balance + "元 紅利點數" + card.bouns +"點，\n");
        }
    }
}

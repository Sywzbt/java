package com.company;

import java.util.Scanner;

class Card {
    protected String number;
    protected int bonus;
    protected int balance;

    Card(String number, int bonus, int balance) {
        this.number = number;
        this.bonus = bonus;
        this.balance = balance;
    }
    void store (int money){
        this.balance += money;
        exchage(money);
    }
    void exchage (int bouns){
        this.bonus += bouns / 1000;
    }
        public String getNumber(){
        return this.number;
    }
}

class gymCard extends Card{
    private boolean gymVIP;
    protected String vaildDate = "4年";
    gymCard(String number, int bonus, int balance){
        super(number, bonus, balance);
    }
    public void setGymVip(){
        gymVIP = true;
    }
    public void outGymVip(){
        gymVIP = false;
    }
    public boolean getGymVip(){
        return gymVIP;
    }
    public String getVaildDate() {
        return vaildDate;
    }
}

class shopCard extends Card{
    private boolean buffetVIP;
    private float feedback = (float) 0.05;
    protected String vaildDate = "3年";
    shopCard(String number, int bonus, int balance) {
        super(number, bonus, balance);
    }
    public void setBufferVIP(){
        buffetVIP = true;
    }
    public void outBufferVIP(){
        buffetVIP = false;
    }
    public float getfeedBack(){
        return feedback;
    }
    public boolean getBuffetVip(){
        return buffetVIP;
    }
    public String getVaildDate(){
        return vaildDate;
    }
}
public class cashAppInherit {

    public static void main(String[] args) {
        gymCard[] gym_Cards = {
                new gymCard("B001", 8000, 0),
                new gymCard("B002", 1000, 0),
        };
        shopCard[] shop_Cards = {
                new shopCard("A001", 500, 0),
                new shopCard("A002", 600, 0),
        };

        Scanner scn = new Scanner(System.in);
        System.out.println("運動卡會員列表");
        for (gymCard gymCard : gym_Cards){
            System.out.printf("會員編號:%s 目前儲值金:%s 紅利點:%d ", gymCard.number, gymCard.balance, gymCard.bonus);
            System.out.println("請問要設置VIP? 選擇 (1)設置 (2)撤銷 (任意數)放棄");
            int type = scn.nextInt();
            if(type == 1){
                gymCard.setGymVip();
            }else if(type == 2){
                gymCard.outGymVip();
            }
            System.out.printf("%s 運動卡資訊 VIP狀態:%b 有效日期:%s\n", gymCard.number, gymCard.getGymVip(), gymCard.getVaildDate());
        }
        System.out.println("血拚卡會員列表");
        for (shopCard shopCard : shop_Cards){
            System.out.printf("會員編號:%s 目前儲值金:%s 紅利點:%d ", shopCard.number, shopCard.balance, shopCard.bonus);
            System.out.println("請問要設置VIP? 選擇 (1)設置 (2)撤銷 (任意數)放棄");
            int type = scn.nextInt();
            if(type == 1){
                shopCard.setBufferVIP();
            }else if(type == 2){
                shopCard.outBufferVIP();
            }System.out.printf("%s 血拚卡資訊 VIP狀態:%b 消費回饋%f 有效日期:%s\n", shopCard.number, shopCard.getBuffetVip(), shopCard.getfeedBack(), shopCard.getVaildDate());
        }
    }
}

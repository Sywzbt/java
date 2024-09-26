package com.company;

interface base{
    String getPlayer_name();
    String getSkill();
    String getCareer();
    int getLv();
    float getExp();
    float playerGetExp(int _exp);
    public float playerDeath();
    public String Status();
    public void getData();
}
class Beginner implements base{
    private String player_name;
    private String skill;
    private String career;
    private int lv;
    private float exp;
    Beginner(String player_name, int lv){
        this.player_name = player_name;
    }
    public String getPlayerName() {
        return this.player_name;
    }

    public String getPlayer_name() {
        return this.player_name;
    }

    public String getSkill(){
        return this.skill;
    }

    public int getLv(){
        return this.lv;
    }

    public float getExp(){
        return this.exp;
    }

    public String getCareer(){
        return this.career;
    }

    public float playerGetExp(int _exp){
        this.exp = this.exp+_exp*5;
        System.out.println(this.getPlayerName()+"消滅"+_exp+"等怪獸已取得"+this.exp+"點經驗值");
        return this.exp;
    }

    public float playerDeath(){
        this.exp *=0.9;
        System.out.println(this.getPlayerName()+"已遭怪獸擊殺僅剩"+this.exp+"點經驗值");
        return this.exp;
    }

    public String Status(){
        return "玩家名稱:"+this.getPlayerName()+"\n"+"角色等級:"+this.getLv()+"\n"+"職業名稱:"+this.getCareer()+"\n"+"技能名稱:"+this.getSkill()+"\n"+"經驗值:"+this.getExp();
    }

    public void getData(){
        System.out.println(Status());
    }
}

class Mage extends Beginner{
    private String player_name;
    private String skill;
    private String career;
    private int lv;
    private float exp;
    Mage(String player_name, int lv){
        super(player_name, lv);
        this.skill = "火球術";
        this.career = "見習法師";
        this.exp = 100;
    }
    public String getCareer(){
        return this.career;
    }
    public String getSkill(){
        return this.skill;
    }
    public float playerGetExp(int _exp){
        this.exp = this.exp+_exp*2;
        System.out.println(this.getPlayerName()+"消滅"+_exp+"等怪獸已取得"+this.exp+"點經驗值");
        return this.exp;
    }
    public float playerDeath(){
        this.exp *=0.8;
        System.out.println(this.getPlayerName()+"已遭怪獸擊殺僅剩"+this.exp+"點經驗值");
        return this.exp;
    }
    public String Status(){
        return "玩家名稱:"+this.getPlayerName()+"\n"+"角色等級:"+this.getLv()+"\n"+"職業名稱:"+this.getCareer()+"\n"+"技能名稱:"+this.getSkill()+"\n"+"經驗值:"+this.exp;
    }
}
public class swordAndMagic {
    public static void main(String[] args){
        System.out.println("Abstract Class:");
        Beginner player_1 = new Beginner("小黑",1);
        player_1.playerGetExp(10);
        player_1.playerDeath();
        player_1.getData();
        Mage player_2 = new Mage("小黃",30);
        player_2.playerGetExp(15);
        player_2.playerDeath();
        player_2.getData();
    }
}
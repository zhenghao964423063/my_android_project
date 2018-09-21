package com.example.asus.uibasepractice;

/**
 * Created by ASUS on 2018/4/9.
 */

public class Msg {
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SENT = 1;
    private String content;
    private int type;
    public Msg(String content,int type){
        this.content = content;
        this.type = type;
    }
    public int getType(){
        return type;
    }
    public String getContent(){
        return content;
    }

}

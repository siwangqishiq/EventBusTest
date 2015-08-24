package com.xinlan.eventbustest;

/**
 * Created by Administrator on 2015/8/24.
 */
public class MyEvent {
    private String msg;

    public MyEvent(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}//end class

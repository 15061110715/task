package com.model;

import com.action.Action;

/**
 * Created by 包子 on 2017/9/9.
 */
public class UpperAction implements Action {
    private String message;
    public String getMessage(){
        return message;
    }
    public void setMessage(String string){
        message=string;
    }
    public String execute(String str){
        return (getMessage()+str).toUpperCase();
    }
}

package com.example.pojo;

//用户类
public class User {
    private Integer userid;     //用户ID
    private String password;    //用户密码
    private Status status;   //用户状态

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatusid() {
        return status;
    }

    public void setStatusid(Status status) {
        this.status = status;
    }
}

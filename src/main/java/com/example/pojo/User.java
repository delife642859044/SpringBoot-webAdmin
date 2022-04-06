package com.example.pojo;

//用户类
public class User {
    private Integer userid;     //用户ID
    private String username;    //用户
    private String password;    //用户密码
    private Integer statusid;   //用户状态

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

    public Integer getStatus() {
        return statusid;
    }

    public void setStatus(Integer status) {
        this.statusid = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + statusid +
                '}';
    }
}

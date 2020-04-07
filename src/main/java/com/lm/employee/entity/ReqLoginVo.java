package com.lm.employee.entity;

public class ReqLoginVo {
    private String emplId;
    private String password;

    public String getEmplId() {
        return emplId;
    }

    public void setEmplId(String emplId) {
        this.emplId = emplId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ReqLoginVo{" +
                "emplId='" + emplId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

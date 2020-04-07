package com.lm.employee.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class Employee implements Serializable {

    @ApiModelProperty(value = "员工id")
    private String emplId;

    @ApiModelProperty(value = "登录密码")
    private String password;

    @ApiModelProperty(value = "员工姓名")
    private String emplName;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "身份证号")
    private String idCard;

    @ApiModelProperty(value = "出生年月日")
    private String birthday;

    @ApiModelProperty(value = "籍贯")
    private String nativePlace;

    @ApiModelProperty(value = "民族")
    private String nation;

    @ApiModelProperty(value = "住址")
    private String address;

    @ApiModelProperty(value = "学历")
    private String education;

    @ApiModelProperty(value = "毕业院校")
    private String school;

    @ApiModelProperty(value = "专业")
    private String major;

    @ApiModelProperty(value = "政治面貌")
    private String ploityface;

    @ApiModelProperty(value = "部门号")
    private String deptNo;

    @ApiModelProperty(value = "岗位")
    private String stationName;

    @ApiModelProperty(value = "备注")
    private String remarks;

}

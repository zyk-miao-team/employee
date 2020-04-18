package com.lm.employee.entity;

import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 招聘信息
 */
@Data
public class Application {

    @ApiModelProperty(value = "流水号")
    private String id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "手机号")
    private String mobile;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "应聘岗位")
    private String job;

    @ApiModelProperty(value = "学历")
    private String education;

    @ApiModelProperty(value = "毕业院校")
    private String school;

    @ApiModelProperty(value = "专业")
    private String major;

    @ApiModelProperty(value = "经历")
    private String experience;

    @ApiModelProperty(value = "创建时间")
    private String createTime;

    @ApiModelProperty(value = "备注")
    private String remark;


}

package com.lm.employee.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 部门信息
 */
@Data
public class Department {

    @ApiModelProperty(value = "部门号")
    private String deptNo;

    @ApiModelProperty(value = "部门名称")
    private String deptName;

    @ApiModelProperty(value = "部门主管")
    private String head;

    @ApiModelProperty(value = "部门简介")
    private String describe;


}

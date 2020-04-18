package com.lm.employee.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
public class GiveRole implements Serializable {

    @ApiModelProperty(value = "员工id")
    private String emplId;

    @ApiModelProperty(value = "员工姓名")
    private String emplName;

    @ApiModelProperty(value = "角色id")
    private String roleId;

    @ApiModelProperty(value = "角色名称")
    private String roleName;


}

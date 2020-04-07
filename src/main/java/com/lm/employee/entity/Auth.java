package com.lm.employee.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Auth {

    @ApiModelProperty(value = "权限id")
    private String authId;

    @ApiModelProperty(value = "权限名")
    private String authName;

    @ApiModelProperty(value = "父id")
    private String pId;

    @ApiModelProperty(value = "路径")
    private String path;

    //添加元素
    private List<Auth> children=new ArrayList<>();

}

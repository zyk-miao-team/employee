package com.lm.employee.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.Date;

/**
 * 薪资信息
 */
@Data
public class Salary {

    @ApiModelProperty(value = "流水号")
    private String id;

    @ApiModelProperty(value = "员工id")
    private String emplId;

    @ApiModelProperty(value = "员工姓名")
    private String emplName;

    @ApiModelProperty(value = "基本工资")
    private String basic;

    @ApiModelProperty(value = "补贴")
    private String extra;

    @ApiModelProperty(value = "全勤")
    private String full;

    @ApiModelProperty(value = "罚款")
    private String fine;

    @ApiModelProperty(value = "纳税")
    private String scot;

    @ApiModelProperty(value = "总计")
    private String total;

    @ApiModelProperty(value = "发放时间")
    private Date payTime;


}

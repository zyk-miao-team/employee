package com.lm.employee.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 考勤信息
 */
@Data
public class Attendance {

    @ApiModelProperty(value = "流水号")
    private String id;

    @ApiModelProperty(value = "员工id")
    private String emplId;

    @ApiModelProperty(value = "员工姓名")
    private String emplName;

    @ApiModelProperty(value = "迟到")
    private String late;

    @ApiModelProperty(value = "早退")
    private String leave;

    @ApiModelProperty(value = "旷工")
    private String absenteeism;

    @ApiModelProperty(value = "请假")
    private String askforLeave;

    @ApiModelProperty(value = "考勤时间")
    private String time;


}

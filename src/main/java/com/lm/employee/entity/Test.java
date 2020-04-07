package com.lm.employee.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Test implements Serializable {
    private String authId;
    private String authName;
    private String pId;
    private String path;
}

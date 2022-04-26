package com.xiaodi.qa.job;

import lombok.Data;

/**
 * Created by xiaodi.gou on 2022/4/6
 */
@Data
public class ResultData {

    private Boolean success;
    private int code;
    private Object data;
}

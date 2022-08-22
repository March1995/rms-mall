package com.wyb.rms.auth.center.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Description:
 *
 * @author Marcher丶
 * @date 2022-08-08 22:25
 **/
@Data
public class CommonResponse<T> implements Serializable {

    private static final long serialVersionUID = -1L;

    private Integer code;
    private Boolean success;
    private String msg;
    private T data;

    public CommonResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

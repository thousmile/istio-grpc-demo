package com.xaaef.grpc.util;

import io.grpc.Status;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 统一返回实体类
 * </p>
 */

@Getter
@Setter
public class ResponseWrapper<T> implements Serializable {

    private Status status;

    private T data;

    public String getMessage() {
        return this.status.getDescription();
    }

    public boolean isOk() {
        return this.status.isOk();
    }

    private ResponseWrapper() {
    }

    public static <T> ResponseWrapper<T> result(Status status, T data) {
        var result = new ResponseWrapper<T>();
        result.status = status;
        result.data = data;
        return result;
    }

}

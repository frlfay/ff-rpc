package com.ff.ffrpc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName: RpcResponse
 * Package: com.ff.ffrpc.model
 * Description: PRC 响应
 * 响应类 RpcResponse 的作用是封装调用方法得到的返回值、以及调用的信息（比如异常情况）等
 *
 * @Author: FLFfang
 * @Create: 2025/3/12 - 20:56
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RpcResponse implements Serializable {

    /**
     * 响应数据
     */
    private Object data;

    /**
     * 响应数据类型（预留）
     */
    private Class<?> dataType;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 异常信息
     */
    private Exception exception;
}

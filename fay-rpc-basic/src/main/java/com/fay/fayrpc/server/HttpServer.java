package com.fay.fayrpc.server;

/**
 * ClassName: HttpServer
 * Package: com.fay.fayrpc.server
 * Description: HTTP 服务器接口
 *
 * @Author: FLFfang
 * @Create: 2025/3/12 - 18:20
 */
public interface HttpServer {

    /**
     * 启动服务器
     *
     * @param port
     */
    void doStart(int port);
}

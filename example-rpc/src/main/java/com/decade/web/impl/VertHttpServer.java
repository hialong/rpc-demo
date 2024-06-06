package com.decade.web.impl;

import com.decade.web.HttpServer;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpMethod;

public class VertHttpServer implements HttpServer {
    @Override
    public void start(int port) {
        // 创建vertx
        Vertx vertx = Vertx.vertx();
        // 创建httpServer
        io.vertx.core.http.HttpServer httpServer = vertx.createHttpServer();
        httpServer.requestHandler(request->{
            HttpMethod method = request.method();
            System.out.println("receive request"+request.method()+"from"+request.uri());
            request.response().end("hello world");
        });

    }
}

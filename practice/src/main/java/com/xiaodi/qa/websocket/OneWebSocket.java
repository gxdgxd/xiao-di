package com.xiaodi.qa.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author xiaodi.gou
 * @create 2021/11/12 10:59 上午
 */
@Slf4j
@ServerEndpoint("/gouxd/one")
@Component
public class OneWebSocket {

    private static AtomicInteger onlineCount = new AtomicInteger(0);

    @OnOpen
    public void onOpen(Session session) {
        onlineCount.incrementAndGet();
        log.info("有新连接加入，sessionId是{},当前连接个数为{}", session.getId(), onlineCount.get());
    }

    @OnClose
    public void onClose(Session session) {
        onlineCount.decrementAndGet();
        log.info("当前人数下线，sessionId是{},连接数为{}", session.getId(), onlineCount.get());
    }

    @OnMessage
    public void onMessage(Session session, String message) {
        log.info("收到客户端sessionId是{},的消息是{}", session.getId(), message);
        this.sendMessage("Hello" + message, session);
    }

    @OnError
    public void error(Session session, Throwable e) {
        log.error("发生错误");
        e.printStackTrace();
    }


    //服务端给客户端发送消息
    private void sendMessage(String message, Session tosession) {
        log.info("服务端给客户端{},发送消息{}", tosession.getId(), message);
        try {
            tosession.getBasicRemote().sendText(message);
        } catch (IOException e) {
            log.error("服务端给客户端发送消息失败:{}", e);
        }

    }
}

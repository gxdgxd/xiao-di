package com.xiaodi.qa.websocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author xiaodi.gou
 * @create 2021/11/12 1:26 下午
 */
@Slf4j
@ServerEndpoint("/test/many")
@Component
public class OneToManyWebsocket {

    //存放所有在线的客户端数
    private static AtomicInteger onlineCount = new AtomicInteger(0);

    //存放所有的客户端
    private static Map<String, Session> clients = new ConcurrentHashMap<>();

    /**
     * 连接建立成功调用的方法
     *
     * @param session
     */
    @OnOpen
    public void open(Session session) {
        onlineCount.incrementAndGet();
        clients.put(session.getId(), session);
        log.info("有新连接sessionId={}加入,当前在线人数是{}", session.getId(), onlineCount.get());
    }


    /**
     * 连接关闭调用的方法
     *
     * @param session
     */
    @OnClose
    public void onClose(Session session) {
        onlineCount.decrementAndGet();
        clients.remove(session.getId());
        log.info("当前连接关闭，在线个数是{}", onlineCount.get());
    }

    //服务器收到客户端的消息调用的方法
    @OnMessage
    public void onMessage(String message, Session session) {
        log.info("服务端收到客户端sessionId:{},的消息:{}", session.getId(), message);
        this.sendMessage(message, session);
    }

    //连接发生错误的回调方法
    @OnError
    public void onError(Session session, Throwable error) {
        log.error("发生错误");
        error.printStackTrace();
    }

    private void sendMessage(String message, Session fromSession) {
        log.info("服务端给客户端sessionId:{}发送消息:{}", fromSession.getId(), message);

        for (Map.Entry<String, Session> entry : clients.entrySet()) {
            Session toSession = entry.getValue();
            if (!fromSession.getId().equals(toSession.getId())) ;
            log.info("服务端给客户端:{},发送消息:{}", toSession.getId(), message);
            toSession.getAsyncRemote().sendText("服务端" + message);
        }
    }
}


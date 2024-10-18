package com.ranmao.demo.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.DefaultHandshakeHandler;

import java.security.Principal;
import java.util.Map;

/**
 * @author ran.mao
 * @version 1.0.0.1
 * @description：TODO
 * @date 2024/10/8 13:49
 */
public class UserHandshakeHandler extends DefaultHandshakeHandler {
    private static final Logger logger = LoggerFactory.getLogger(DefaultHandshakeHandler.class);

    @Override
    protected Principal determineUser(ServerHttpRequest request, WebSocketHandler wsHandler, Map<String, Object> attributes) {
        return null;
    }
}

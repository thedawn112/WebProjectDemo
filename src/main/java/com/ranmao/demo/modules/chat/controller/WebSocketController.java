package com.ranmao.demo.modules.chat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author ran.mao
 * @version 1.0.0.1
 * @description：TODO
 * @date 2024/10/8 14:03
 */
@RestController
public class WebSocketController {
    private static final Logger LOGGER= LoggerFactory.getLogger(WebSocketController.class);
    ////这里匹配发送信息头里面的第二部分
    @MessageMapping("/chatMessage/send")
    @SendTo("/user/queue/chatMessage/receive")
    public void chat(@Payload String message, Principal principal){
        LOGGER.info("{} send message: {}", principal.getName(), message);
        // TODO: 2024/10/8 处理 天消息并推送给其他在线客户端
        // 假设推送消息的代码
        LOGGER.info("推送消息: {}", message);
        // TODO: 2024/10/8 推送消息的代码
    }
}
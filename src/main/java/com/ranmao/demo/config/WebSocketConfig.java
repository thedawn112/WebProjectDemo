package com.ranmao.demo.config;

import com.ranmao.demo.core.UserHandshakeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@EnableWebSocketMessageBroker
@Configuration
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    private TaskScheduler messageBrokerTaskScheduler;

    @Autowired
    public void setMessageBrokerTaskScheduler(@Lazy TaskScheduler taskScheduler) {
        this.messageBrokerTaskScheduler = taskScheduler;
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //endpoint注册协议节点，并映射指定url点对点用
        //注册一个名字为handshake的endpoint
        //这里匹配url路径
        registry.addEndpoint("/handshake")
                .setAllowedOrigins("*")//允许跨域
                //请求的handler处理
                .setHandshakeHandler(new UserHandshakeHandler());
    }
    /**
     * 配置消息代理（message broker）
     * 启用一个简单的基于内存的消息代理
     * */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //send命令时需要带上/socket前缀
        //全局使用的消息前缀（客户端路径上会体现出来）
        //这里匹配发送信息头里面的第一部分
        registry.setApplicationDestinationPrefixes("/socket")
                //点对点的使用订阅前缀（客户路径上会体现出来）
                //不设置的话，默认也是/user
                .setUserDestinationPrefix("/user")
                //订阅broker名称：topic代表发布广播，即群发
                //queue表示点对点，即发送指定用户
                .enableSimpleBroker("/topic", "/queue")
                .setHeartbeatValue(new long[]{10000, 20000})
                .setTaskScheduler(this.messageBrokerTaskScheduler);
    }
}
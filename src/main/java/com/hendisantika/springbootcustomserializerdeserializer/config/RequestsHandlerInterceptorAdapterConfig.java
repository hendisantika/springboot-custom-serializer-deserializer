package com.hendisantika.springbootcustomserializerdeserializer.config;

import org.slf4j.MDC;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.hendisantika.springbootcustomserializerdeserializer.SpringbootCustomSerializerDeserializerApplication.CUSTOM_API;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-custom-serializer-deserializer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/02/20
 * Time: 06.31
 */
@Configuration
public class RequestsHandlerInterceptorAdapterConfig extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        MDC.put(CUSTOM_API, request.getHeader(CUSTOM_API));
        return true;
    }
}
